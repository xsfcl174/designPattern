package com.fancl.ambassador;

public class Client {
    private RemoteServiceInterface service = new ServiceAmbassador();

    public long call(int param) {
        return service.doRemoteFunction(param);

    }
}
