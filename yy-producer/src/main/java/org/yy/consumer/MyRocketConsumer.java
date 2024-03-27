//package org.yy.consumer;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//@RocketMQMessageListener(topic = "test", consumerGroup = "test-consumer-group")
//public class MyRocketConsumer implements RocketMQListener<String> {
//
//
//    Logger log = LoggerFactory.getLogger(MyRocketConsumer.class);
//
//    @Override
//    public void onMessage(String s) {
//        log.info("");
//    }
//}
