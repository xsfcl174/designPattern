package com.fancl.ambassador;

/**
 * ServiceAmbassador为客户端提供了一种对原有RemoteServiceInterface接口的代理，在不改动原有代码的基础上为老接口提供较为安全的重试机制以及日志记录功能
 */
public class ServiceAmbassador implements RemoteServiceInterface {
    static final int RETRY_TIME = 3;
    static final int DELAY_TIME = 1000;

    public long doRemoteFunction(int param) {
        return safeCall(param);
    }

    protected long safeCall(int param) {
        long res = -1;
        for (int i = 0; i < RETRY_TIME; i++) {
            if ((res = callWithTimeCheck(param)) == -1) {
                System.err.println("call RemoteServiceInterface fail,we will retry after " + DELAY_TIME + "ms");
                try {
                    Thread.sleep(DELAY_TIME);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            } else
                break;
        }
        return res;
    }

    private long callWithTimeCheck(int param) {
        long start = System.currentTimeMillis();
        long res = RemoteService.getInstance().doRemoteFunction(param);
        long cast = System.currentTimeMillis() - start;
        System.out.println("call doRemoteFunction cost:" + cast + "ms");
        return res;
    }
}
