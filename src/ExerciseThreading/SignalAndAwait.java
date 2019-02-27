package ExerciseThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SignalAndAwait {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public void thread1(){
        try {
            System.out.println("Thread 1 started");
            lock.lock();
            condition.await();
            System.out.println("Thread 1 ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public void thread2() {
        try {
            System.out.println("Thread 2 started");
            lock.lock();
            System.out.println("Thread 2 ended");
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SignalAndAwait signalAndAwait = new SignalAndAwait();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAndAwait.thread1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                signalAndAwait.thread2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
