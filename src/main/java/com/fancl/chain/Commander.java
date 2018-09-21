package com.fancl.chain;

public class Commander extends RequestHandler {
    public Commander(RequestHandler requestHandler) {
        super( requestHandler);
    }

    @Override
    public void handle(Request request) {
        super.handle(request);
    }

    @Override
    public String toString() {
        return "Commander";
    }


}
