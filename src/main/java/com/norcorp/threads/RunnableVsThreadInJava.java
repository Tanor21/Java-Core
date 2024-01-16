package com.norcorp.threads;

//class C implements Runnable {
//    public void run() {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class D implements Runnable{
//    public void run() {
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class RunnableVsThreadInJava {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("==================================== ☕ JAVA THREADS VS RUNNABLE ☕ ====================================");
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");

        /*
            Threads Vs Runnable :
         */
        Runnable obj1 = () -> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        System.out.println();
        t1.start();
        t2.start();
        System.out.println();
        System.out.println("☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️☕️️️");
    }
}
