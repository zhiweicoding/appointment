package com.zbkj.admin.task.order;

import com.zbkj.common.utils.DateUtil;
import com.zbkj.service.service.OrderTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 订单自动完成Task

 */
@Component
@Configuration //读取配置
@EnableScheduling // 2.开启定时任务
public class OrderAutoCompleteTask {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(OrderCompleteTask.class);

    @Autowired
    private OrderTaskService orderTaskService;

    @Scheduled(fixedDelay = 1000 * 60L * 60) //每小时同步一次数据
    public void init() {
        logger.info("---OrderAutoCompleteTask task------produce Data with fixed rate task: Execution Time - {}", DateUtil.nowDateTime());
        try {
            orderTaskService.autoComplete();
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("OrderAutoCompleteTask.task" + " | msg : " + e.getMessage());
        }

    }

}
