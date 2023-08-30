package com.kubertX.springboot.action.mq.kafka;

import com.kubertX.springboot.action.mq.kafka.constants.KafkaConstants;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootTest
public class KafkaTestApplication {


    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Test
    public void testSend(){
        kafkaTemplate.send(KafkaConstants.TOPIC_TEST,"hello,kafka ...");
    }
}
