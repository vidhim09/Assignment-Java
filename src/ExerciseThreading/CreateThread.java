package ExerciseThreading;

public class CreateThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Via Runnable");
        Thread t1 = new Thread(new CreateThread1());
        t1.start();
        System.out.println("Via Thread Class");
        CreateThread2 t2 = new CreateThread2();
        t2.start();
        t1.join();
        System.out.println("Main thread Ended");
    }
}


class CreateThread1 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Created T1 Thread running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class CreateThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Created T2 Thread running");
    }
}