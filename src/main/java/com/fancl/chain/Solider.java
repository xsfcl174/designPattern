package com.fancl.chain;

public class Solider extends RequestHandler {
    public Solider() {
        super(null);
    }

    @Override
    public void handle(Request request) {
        switch (request.getRequestType()) {
            case DEFENCE:
            case ATTACK:
                printRequest(request);
                request.completeRequest();
                break;

        }
    }

    @Override
    public String toString() {
        return "Solider";
    }
}
