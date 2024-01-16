package com.norcorp.threads;

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA THREADS ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Threads :
            In Java, a thread refers to the smallest unit of execution within a process.
            A process, in general, can have multiple threads running concurrently, each performing a separate task.
            Threads in Java are used to achieve parallelism and concurrency, allowing different parts
            of a program to execute independently.
         */

        A obj1 = new A();
        B obj2 = new B();

        //System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        System.out.println();
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
