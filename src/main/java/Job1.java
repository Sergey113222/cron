import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.time.LocalDateTime;

public class Job1 implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println("Job1 --->>> Hello Sergey! Time is " + LocalDateTime.now());
    }
}
