package ExerciseThreading;

public class SynchronizeMethod {
    int counter;
    synchronized public void incrementCounter(){
        counter++;
//        System.out.println("Current Value "+ counter++);
    }

    public void method1(){
        for(int i = 0 ; i < 1000 ; i++){
            incrementCounter();
        }
    }

    public void method2(){
        for(int i = 0 ; i < 1000 ; i++){
            incrementCounter();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizeMethod sm = new SynchronizeMethod();
        System.out.println("Initial Counter Value "+sm.counter);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method 1 called");
                sm.method1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Method 2 called");
                sm.method2();
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        t1.stop();
        t2.stop();
        System.out.println("Final Counter Value "+sm.counter);
    }
}
