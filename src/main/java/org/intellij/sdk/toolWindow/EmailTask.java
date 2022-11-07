package org.intellij.sdk.toolWindow;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class EmailTask {
    @Scheduled(cron = "0/2 * * * * ?")
    public void CheckEmailTask(){
        System.out.println("检查邮件任务："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}