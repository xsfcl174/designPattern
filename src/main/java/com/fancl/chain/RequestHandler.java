package com.fancl.chain;

import java.util.Optional;

public abstract class RequestHandler {
    private Optional<RequestHandler> handler;

    public RequestHandler(RequestHandler handler) {
        this.handler = Optional.ofNullable(handler);
    }

    public void handle(Request request) {
        handler.ifPresent(requestHandler -> requestHandler.handle(request));
    }

    protected void printRequest(Request request){
        System.out.println(this+" handling request:"+request.getRequestDetail());
    }

    @Override
    public abstract String toString();
}
