package com.cloud.kafka.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaUtil {
    private static KafkaTemplate<String, String> template;

    @SuppressWarnings("All")
    @Autowired
    public void setTemplate(KafkaTemplate<String, String> template) {
        KafkaUtil.template = template;
    }

    public static void sendMsg(String topic, String message){
        DefaultKafkaProducerFactory
        template.send(topic, 3, "kk", message);
    }
}
