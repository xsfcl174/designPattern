package com.fancl.chain;

public class King {
    private RequestHandler chain;

    public King() {
        buildChain();
    }

    protected void buildChain() {
        this.chain = new Commander(new Officer(new Solider()));
    }

    public void sendCommand(Request request) {
        this.chain.handle(request);
    }
}
