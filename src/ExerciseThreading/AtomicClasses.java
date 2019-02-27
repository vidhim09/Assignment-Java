package ExerciseThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClasses {
    AtomicInteger counter = new AtomicInteger();
    public void incrementCounter(){
        counter.incrementAndGet();
    }

    public void method1(){
        for(int i = 0 ; i < 100000 ; i++){
            incrementCounter();
        }
    }

    public void method2(){
        for(int i = 0 ; i < 100000 ; i++){
            incrementCounter();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicClasses atomicClasses = new AtomicClasses();
        System.out.println("Initial Counter Value "+atomicClasses.counter);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method 1 called");
                atomicClasses.method1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method 2 called");
                atomicClasses.method2();
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        t1.stop();
        t2.stop();
        System.out.println("Final Counter Value "+atomicClasses.counter);
    }
}
