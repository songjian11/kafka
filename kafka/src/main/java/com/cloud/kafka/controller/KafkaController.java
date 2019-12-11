package com.cloud.kafka.controller;

import com.cloud.kafka.util.KafkaUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {
    @GetMapping("sendMsg")
    public String sendMsg(String msg){
        KafkaUtil.sendMsg("test", msg);
        return "is ok";
    }
}
