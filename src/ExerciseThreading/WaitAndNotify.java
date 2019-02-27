package ExerciseThreading;

public class WaitAndNotify {
    public void thread1(){
        synchronized (this){
            System.out.println("Thread 1 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 ended");
            System.out.println("===========================================");
        }
    }
    public void thread2() {
        synchronized (this){
            System.out.println("Thread 2 started");
            System.out.println("Thread 2 ended");
            notify();
        }
    }
    public static void main(String[] args) {
        WaitAndNotify waitAndNotify1 = new WaitAndNotify();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotify1.thread1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotify1.thread2();
            }
        }).start();


        WaitAndNotifyAll waitAndNotifyAll = new WaitAndNotifyAll();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyAll.thread1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyAll.thread2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyAll.thread3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitAndNotifyAll.thread4();
            }
        }).start();
    }
}

class WaitAndNotifyAll{
    public void thread1(){
        synchronized (this){
            System.out.println("Thread 1 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 ended");

        }
    }

    public void thread2(){
        synchronized (this){
            System.out.println("Thread 2 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 ended");

        }
    }

    public void thread3(){
        synchronized (this){
            System.out.println("Thread 3 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 ended");

        }
    }

    public void thread4() {
        synchronized (this){
            System.out.println("Thread 4 started");
            System.out.println("Thread 4 ended");
            notifyAll();
        }
    }
}