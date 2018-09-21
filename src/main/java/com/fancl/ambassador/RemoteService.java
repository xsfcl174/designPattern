package com.fancl.ambassador;

/**
 * 假定有这样一个接口实现是一个老古董，各种卡顿，还有可能调用失败
 */
public class RemoteService implements RemoteServiceInterface {
    private static RemoteService service;
    private RemoteService(){

    }

    public static final synchronized RemoteService getInstance(){
        if(service==null)
            service = new RemoteService();
        return service;
    }

    public long doRemoteFunction(int param) {
        long sleepTime = (long) Math.floor(Math.random() * 1000);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return sleepTime <= 500 ? param * 10 : -1;
    }
}
