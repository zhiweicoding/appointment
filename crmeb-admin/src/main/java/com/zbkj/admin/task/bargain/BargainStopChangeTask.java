package com.zbkj.admin.task.bargain;

import com.zbkj.common.utils.DateUtil;
import com.zbkj.service.service.StoreBargainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 砍价活动结束状态变化定时任务

 */
@Component
@Configuration //读取配置
@EnableScheduling // 2.开启定时任务
public class BargainStopChangeTask {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(BargainStopChangeTask.class);

    @Autowired
    private StoreBargainService storeBargainService;

    @Scheduled(cron = "0 0 0 */1 * ?") //5秒钟同步一次数据
    public void init(){
        logger.info("---BargainStopChangeTask------bargain stop status change task: Execution Time - {}", DateUtil.nowDateTime());
        try {
            storeBargainService.stopAfterChange();
        }catch (Exception e){
            e.printStackTrace();
            logger.error("BargainStopChangeTask" + " | msg : " + e.getMessage());
        }

    }

}
