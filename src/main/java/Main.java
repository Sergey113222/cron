import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, SchedulerException, InterruptedException, IOException {
        System.out.println("Enter CRON expression:");
        String cronExpression = new ConsoleReader().readCronExpression();
        JobDetail job = new MyJobBuilder().get(Job1.class);
        Trigger trigger = new MyTriggerBuilder().get(cronExpression);

        Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
        scheduler1.start();
        scheduler1.scheduleJob(job, trigger);

        Thread.sleep(100000);
        scheduler1.shutdown();
    }
}
