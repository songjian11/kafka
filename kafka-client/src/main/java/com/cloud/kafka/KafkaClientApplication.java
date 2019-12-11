package com.cloud.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaClientApplication.class, args);
		System.out.println("===============kafka Client启动成功===============");
	}

}
