package org.yy.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "test", consumerGroup = "test-consumer-group")
public class OwnRocketConsumer implements RocketMQListener<String> {


    Logger log = LoggerFactory.getLogger(OwnRocketConsumer.class);

    @Override
    public void onMessage(String s) {
        log.info("收到消息：===={}", s);
    }
}
