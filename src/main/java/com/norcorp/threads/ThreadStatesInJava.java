package com.norcorp.threads;

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

public class ThreadStatesInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA THREAD STATES ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Thread States :
         */
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        System.out.println();
        t1.start();
        t2.start();
        System.out.println(c.count);
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
