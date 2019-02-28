package ExerciseThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1,Lock lock2){
        if(lock1.tryLock() && lock2.tryLock())
            return;
        if (lock1.tryLock())
            lock1.unlock();
        if (lock2.tryLock())
            lock2.unlock();
    }

    public void thread1(){
        acquireLock(lock1,lock2);
        System.out.println("Thread 1 started");
        System.out.println("Thread 1 ended");
        lock2.unlock();
        lock1.unlock();
    }
    public void thread2() {
        acquireLock(lock2,lock1);
        System.out.println("Thread 2 started");
        System.out.println("Thread 2 ended");
        lock1.unlock();
        lock2.unlock();
    }
    public static void main(String[] args) throws InterruptedException,IllegalMonitorStateException {
        TryLock tryLock = new TryLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLock.thread1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLock.thread2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
