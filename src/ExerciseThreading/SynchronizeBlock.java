package ExerciseThreading;

public class SynchronizeBlock {
    int counter;
    public void incrementCounter(){
        synchronized (this){
            counter++;
        }
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
        SynchronizeBlock sb = new SynchronizeBlock();
        System.out.println("Initial Counter Value "+sb.counter);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method 1 called");
                sb.method1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method 2 called");
                sb.method2();
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        t1.stop();
        t2.stop();
        System.out.println("Final Counter Value "+sb.counter);
    }
}
