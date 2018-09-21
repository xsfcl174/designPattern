package com.fancl.chain;

public class TestMe {
    public static void main(String[] args) {
        King king = new King();
        king.sendCommand(new Request(RequestType.ATTACK, "attack all enemies"));

        king.sendCommand(new Request(RequestType.DEFENCE, "defence  enemy's attack"));

        king.sendCommand(new Request(RequestType.TORTURE, "torture my enemy"));

    }
}
