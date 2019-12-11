package com.cloud.kafka.listen;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListen {
    @KafkaListener(topics = {"${kafka.consumer.test}"})
    private void testListen(ConsumerRecord<String, String> record){
        System.out.println("=======value:" + record.value());
    }
}
