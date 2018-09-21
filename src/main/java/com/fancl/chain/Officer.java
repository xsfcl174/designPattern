package com.fancl.chain;

public class Officer extends RequestHandler {
    public Officer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType() == RequestType.TORTURE) {
            printRequest(request);
            request.completeRequest();
            return;
        }
        super.handle(request);
    }

    @Override
    public String toString() {
        return "Officer";
    }
}
