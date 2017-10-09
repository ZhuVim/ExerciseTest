package com.concurrency;

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted" + "  is Interrupted£¨£©:"
                    + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {

        try {
            sleeper.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Interrupted");
        }
        System.out.println(getName() + " join completed");
    }
}

public class Joining extends Thread {
    public static void main(String[] args) {
        Sleeper sleeper = new Sleeper("sleep", 1500), grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey", sleeper), doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}
