package com.github.ltsopensource.example.spring;

import com.github.ltsopensource.core.domain.Job;
import com.github.ltsopensource.jobclient.JobClient;
import com.github.ltsopensource.jobclient.domain.Response;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Robert HG (254963746@qq.com) on 4/18/16.
 */
public class JobClientMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/lts-jobclient.xml");

        JobClient jobClient = (JobClient) context.getBean("jobClient");

//        Job job = new Job();
//        job.setTaskId("t_realtime_one");
//        job.setParam("shopId", "one");
//        job.setTaskTrackerNodeGroup("test_trade_TaskTracker");
//        job.setNeedFeedback(true);
//        job.setReplaceOnExist(true);        // 当任务队列中存在这个任务的时候，是否替换更新
//        Response response = jobClient.submitJob(job);
//        System.out.println(response);
        
        Job job1 = new Job();
        job1.setTaskId("t_realtime_repeat");
        job1.setParam("shopId", "repeat");
        job1.setTaskTrackerNodeGroup("test_trade_TaskTracker");
        job1.setNeedFeedback(true);
        job1.setReplaceOnExist(true);        // 当任务队列中存在这个任务的时候，是否替换更新
        job1.setRepeatCount(999999999);
        job1.setRepeatInterval(1l);
        Response response1 = jobClient.submitJob(job1);
        System.out.println(response1);
        
//        Job job2 = new Job();
//        job2.setTaskId("t_realtime_cron");
//        job2.setParam("shopId", "cron");
//        job2.setTaskTrackerNodeGroup("test_trade_TaskTracker");
//        job2.setNeedFeedback(true);
//        job2.setReplaceOnExist(true);        // 当任务队列中存在这个任务的时候，是否替换更新
//        job2.setCronExpression("0 0/1 * * * ? *");
//        Response response2 = jobClient.submitJob(job2);
//        System.out.println(response2);
    }

}
