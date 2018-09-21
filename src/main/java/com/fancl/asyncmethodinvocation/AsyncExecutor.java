package com.fancl.asyncmethodinvocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public interface AsyncExecutor {
    <T> AsyncResult<T> execute(Callable<T> task);

    <T> AsyncResult<T> execute(Callable<T> task, AsyncCallback<T> callback);

    <T> T waitForComplete(AsyncResult<T> result) throws InterruptedException, ExecutionException;

}
