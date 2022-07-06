import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.Trigger;

import java.text.ParseException;

public class MyTriggerBuilder {
    public Trigger get(String cronExpression) throws ParseException {
        return org.quartz.TriggerBuilder.newTrigger()
                .withSchedule(CronScheduleBuilder.cronSchedule(new CronExpression(cronExpression)))
                .build();
    }
}
