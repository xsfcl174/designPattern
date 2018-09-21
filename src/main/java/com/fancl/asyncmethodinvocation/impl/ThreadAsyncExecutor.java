package com.fancl.asyncmethodinvocation.impl;

import com.fancl.asyncmethodinvocation.AsyncCallback;
import com.fancl.asyncmethodinvocation.AsyncExecutor;
import com.fancl.asyncmethodinvocation.AsyncResult;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadAsyncExecutor implements AsyncExecutor {
    private final AtomicInteger index = new AtomicInteger(1);

    @Override
    public <T> AsyncResult<T> execute(Callable<T> task) {
        return execute(task,null);
    }

    @Override
    public <T> AsyncResult<T> execute(Callable<T> task, AsyncCallback<T> callback) {
        AsyncResultImpl<T> result = new AsyncResultImpl<>(callback);
        new Thread(() -> {
            try {
                result.setValue(task.call());
            } catch (Exception e) {
                result.setException(e);
            }
        }, "task-" + index.getAndIncrement()).start();
        return result;
    }

    @Override
    public <T> T waitForComplete(AsyncResult<T> result) throws InterruptedException, ExecutionException {
        while (result.hasCompleted()) {
            result.await();
        }
        return result.getValue();
    }


}
