package com.cloud.kafka.service.impl;

import com.cloud.kafka.service.KafkaService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaServiceImpl implements KafkaService {
    @Override
    public void listen() {

    }
}
