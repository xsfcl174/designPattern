package com.fancl.asyncmethodinvocation;

import java.util.concurrent.ExecutionException;

public interface AsyncResult<T> {
    boolean hasCompleted();

    void await() throws InterruptedException;

    T getValue() throws ExecutionException;
}
