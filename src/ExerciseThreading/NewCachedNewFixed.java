package ExerciseThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable{
    int t;
    String str;
    public Test(int t,String str){
        this.str = str;
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Thread "+ t +" start via "+str);
        try {
//            System.out.println(t);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread "+ t +" end via "+str);
    }
}

public class NewCachedNewFixed {
    public static void main(String[] args) {

        ExecutorService executorService1= Executors.newFixedThreadPool(3);
        ExecutorService executorService2= Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executorService1.submit(new Test(i,"fixed"));
            executorService2.submit(new Test(i,"cached"));
        }
        executorService1.shutdown();
        executorService2.shutdown();
    }

}
