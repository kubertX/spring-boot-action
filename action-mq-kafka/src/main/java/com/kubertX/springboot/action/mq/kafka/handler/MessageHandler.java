package com.kubertX.springboot.action.mq.kafka.handler;

import com.kubertX.springboot.action.mq.kafka.constants.KafkaConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageHandler {

    @KafkaListener(topics = KafkaConstants.TOPIC_TEST, containerFactory = "ackContainerFactory")
    public void handleMessage(ConsumerRecord record, Acknowledgment acknowledgment) {
        try {
            String message = (String) record.value();
            log.info("收到消息: {}", message);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            // 手动提交 offset
            acknowledgment.acknowledge();
        }
    }
}
