package com.cloud.kafka.util;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Arrays;
import java.util.stream.Collectors;

//@Component
public class KafkaUtil {
    private static KafkaConsumer<String, String> kafkaConsumer;

    @SuppressWarnings("All")
    @Autowired
    public void setConsumer(KafkaConsumer<String, String> kafkaConsumer) {
        KafkaUtil.kafkaConsumer = kafkaConsumer;
    }

    public static void getMsg(String topic) {
        kafkaConsumer.subscribe(Arrays.asList(topic));
        while (true) {
            ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofSeconds(1));
            for (ConsumerRecord<String, String> record : records) {
                System.out.printf("offset = %d, key = %s, value = %s", record.offset(), record.key(), record.value());
                System.out.println();
            }
        }
    }
}
