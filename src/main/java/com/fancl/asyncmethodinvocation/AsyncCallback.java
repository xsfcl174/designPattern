package com.fancl.asyncmethodinvocation;

import java.util.Optional;

public interface AsyncCallback<T> {

    void callback(T value, Optional<Exception> ex);
}
