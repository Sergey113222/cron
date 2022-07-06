import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;

public class MyJobBuilder {
    public JobDetail get(Class<? extends Job> className){
        return JobBuilder.newJob(className).build();
    }
}
