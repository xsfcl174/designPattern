package com.fancl.asyncmethodinvocation.impl;

import com.fancl.asyncmethodinvocation.AsyncCallback;
import com.fancl.asyncmethodinvocation.AsyncResult;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

public class AsyncResultImpl<T> implements AsyncResult<T> {
    static final int RUNNING = 1;
    static final int FAIL = 2;
    static final int COMPLETE = 3;
    private volatile int currentState = RUNNING;
    private T value;
    private Exception exception;
    private Object lock;
    private Optional<AsyncCallback<T>> callback;

    public AsyncResultImpl(AsyncCallback<T> callback) {
        this.lock = new Object();
        this.callback = Optional.ofNullable(callback);
    }

    public void setException(Exception exception) {
        this.currentState = FAIL;
        this.exception = exception;
        this.callback.ifPresent(cb -> cb.callback(null, Optional.of(exception)));
        synchronized (lock) {
            lock.notifyAll();
        }

    }

    public void setValue(T value) {
        this.currentState = COMPLETE;
        this.value = value;
        this.callback.ifPresent(cb -> cb.callback(value, Optional.empty()));
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    @Override
    public boolean hasCompleted() {
        return currentState <= RUNNING;
    }

    @Override
    public void await() throws InterruptedException {
        synchronized (lock) {
            while (hasCompleted()) {
                lock.wait();
            }
        }
    }

    @Override
    public T getValue() throws ExecutionException {
        if(currentState==RUNNING)
            throw new IllegalStateException("executing");
        if(currentState==FAIL)
            throw new ExecutionException(exception);
        return value;
    }
}
