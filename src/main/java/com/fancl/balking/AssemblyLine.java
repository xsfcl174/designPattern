package com.fancl.balking;

public class AssemblyLine {
    private enum State {
        WORKING, STOP
    }

    private State state = State.STOP;

    public void work() {
        synchronized (this) {
            if (this.state == State.WORKING) {
                System.err.println("it's working,please wait");
                return;
            }
            this.state = State.WORKING;
        }
        System.out.println("working on"+System.currentTimeMillis());
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.err.println("working error:InterruptedException");
        }
        stopWork();
    }

    public synchronized void stopWork() {
        this.state = State.STOP;
    }

}
