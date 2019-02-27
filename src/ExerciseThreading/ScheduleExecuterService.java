package ExerciseThreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecuterService {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executed using Schedule");
            }
            }, 0, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                //                    Thread.sleep(2000L);
                System.out.println("Executed using ScheduleWithFixedDelay");
            }
            }, 0, 1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                //                    Thread.sleep(2000L);
                System.out.println("Executed using ScheduleAtFixedRate");
            }

            }, 0, 2, TimeUnit.SECONDS);
//        executorService.shutdown();
    }
}
