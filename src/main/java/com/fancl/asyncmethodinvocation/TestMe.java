package com.fancl.asyncmethodinvocation;

import com.fancl.asyncmethodinvocation.impl.ThreadAsyncExecutor;

import java.util.concurrent.Callable;

public class TestMe {


    public static void main(String[] args) throws Exception {
        AsyncExecutor executor = new ThreadAsyncExecutor();

        AsyncResult<Integer> asyncResult1 = executor.execute(lazyval(10, 500));
        AsyncResult<String> asyncResult2 = executor.execute(lazyval("test", 300));
        AsyncResult<Long> asyncResult3 = executor.execute(lazyval(50L, 700));
        AsyncResult<Integer> asyncResult4 = executor.execute(lazyval(20, 400), callback("Callback result 4"));
        AsyncResult<String> asyncResult5 = executor.execute(lazyval("callback", 600), callback("Callback result 5"));

        Thread.sleep(350);
        log("Some hard work done");

        // wait for completion of the tasks
        Integer result1 = executor.waitForComplete(asyncResult1);
        String result2 = executor.waitForComplete(asyncResult2);
        Long result3 = executor.waitForComplete(asyncResult3);
        asyncResult4.await();
        asyncResult5.await();

        // log the results of the tasks, callbacks log immediately when complete
        log("Result 1: " + result1);
        log("Result 2: " + result2);
        log("Result 3: " + result3);
    }


    private static <T> Callable<T> lazyval(T value, long delayMillis) {
        return () -> {
            Thread.sleep(delayMillis);
            log("Task completed with: " + value);
            return value;
        };
    }


    private static <T> AsyncCallback<T> callback(String name) {
        return (value, ex) -> {
            if (ex.isPresent()) {
                log(name + " failed: " + ex.map(Exception::getMessage).orElse(""));
            } else {
                log(name + ": " + value);
            }
        };
    }

    private static void log(String msg) {
        System.out.println(msg);
    }
}