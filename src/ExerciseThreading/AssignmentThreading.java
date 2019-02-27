package ExerciseThreading;

//=====================================================================
//  Main Class
//=====================================================================

public class AssignmentThreading {

    //1.Create and Run a Thread using Runnable Interface and Thread class.
    static void question1(){
        System.out.println("1.Create and Run a Thread using Runnable Interface and Thread class.");
        System.out.println("Refer CreateThread.java");
        System.out.println("--------------------------------------");
    }

    //2.Use sleep and join methods with thread.
    static void question2(){
        System.out.println("2.Use sleep and join methods with thread.");
        System.out.println("Refer CreateThread.java");
        System.out.println("--------------------------------------");
    }

    //3.Use a singleThreadExecutor to submit multiple threads.
    static void question3(){
        System.out.println("3.Use a singleThreadExecutor to submit multiple threads.");
        System.out.println("Refer CreateThread.java");
        System.out.println("--------------------------------------");
    }

    //4.Try shutdown() and shutdownNow() and observe the difference.
    static void question4(){
        System.out.println("4.Try shutdown() and shutdownNow() and observe the difference.");
        System.out.println("Refer SingleThreadExecuter.java");
        System.out.println("--------------------------------------");
    }

    //5.Use isShutDown() and isTerminate() with ExecutorService.
    static void question5(){
        System.out.println("5.Use isShutDown() and isTerminate() with ExecutorService.");
        System.out.println("Refer SingleThreadExecuter.java");
        System.out.println("--------------------------------------");
    }


    //6.Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.
    static void question6(){
        System.out.println("6.Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.");
        System.out.println("Refer UsingFutureClass.java");
        System.out.println("--------------------------------------");
    }


    //7.Submit List of tasks to ExecutorService and wait for the completion of all the tasks.
    static void question7(){
        System.out.println("7.Submit List of tasks to ExecutorService and wait for the completion of all the tasks.");
        System.out.println("Refer UsingFutureClass.java");
        System.out.println("--------------------------------------");
    }

    //8.Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
    static void question8(){
        System.out.println("8.Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()");
        System.out.println("Refer ScheduleExecuterService.java");
        System.out.println("--------------------------------------");
    }

    //9.Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
    static void question9(){
        System.out.println("9.Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().");
        System.out.println("Refer NewCachedNewFixed.java");
        System.out.println("--------------------------------------");
    }

    //10.Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.
    static void question10(){
        System.out.println("10.Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.");
        System.out.println("Refer SynchronizeMethod.java");
        System.out.println("--------------------------------------");
    }

    //11.Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.
    static void question11(){
        System.out.println("11.Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.");
        System.out.println("Refer SynchronizeBlock.java");
        System.out.println("--------------------------------------");
    }

    //12.Use Atomic Classes instead of Synchronize method and blocks.
    static void question12(){
        System.out.println("12.Use Atomic Classes instead of Synchronize method and blocks");
        System.out.println("Refer AtomicClasses.java");
        System.out.println("--------------------------------------");
    }

    //13.Coordinate 2 threads using wait() and notify().
    static void question13(){
        System.out.println("13.Coordinate 2 threads using wait() and notify().");
        System.out.println("Refer class WaitAndNotify in WaitAndNotify.java");
        System.out.println("--------------------------------------");
    }

    //14.Coordinate mulitple threads using wait() and notifyAll()
    static void question14(){
        System.out.println("14.Coordinate mulitple threads using wait() and notifyAll()");
        System.out.println("Refer class WaitAndNotifyAll in WaitAndNotify.java");
        System.out.println("--------------------------------------");
    }

    //15.Use Reentract lock for coordinating 2 threads with signal(), signalAll() and await().
    static void question15(){
        System.out.println("15.Use Reentract lock for coordinating 2 threads with signal(), signalAll() and await().");
        System.out.println("Refer SignalAndAwait.java");
        System.out.println("--------------------------------------");
    }

    //16.Create a deadlock and Resolve it using tryLock().
    static void question16(){
        System.out.println("16.Create a deadlock and Resolve it using tryLock().");
        System.out.println("Refer TryLock.java");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
    }
}
