package ExerciseThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class UsingFutureClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //=====================================================================
        //  Question 6 Class
        //=====================================================================

        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService1.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 10;
            }
        });

        executorService1.shutdown();
        //Using isDone and get
        if (integerFuture.isDone()) {
            System.out.println(integerFuture.get());
        }
        //Using isCancelled
        if(integerFuture.isCancelled()){
            System.out.println("Task cancelled");
        }


        //=====================================================================
        //  Question 7 Class
        //=====================================================================

        List<Callable<Integer>> runnableList = new ArrayList<>();

        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });

        ExecutorService executorService2 = Executors
                .newSingleThreadExecutor();

        List<Future<Integer>> futureList = executorService2.invokeAll(runnableList);

        for (Future<Integer> e: futureList
             ) {
            if(e.isDone()){
                try {
                    System.out.println(e.get());
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        }

        executorService2.shutdown();
        executorService2.awaitTermination(1000L,TimeUnit.MILLISECONDS);

        if(executorService2.isTerminated()){
            System.out.println("Terminated");
        }else{
            System.out.println("On or more tasks still remaining");
        }
    }
}
