package com.zorba11.thechefserver.services.kafkaservices;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "chef_status",groupId = "group_id")
    public void consumeMessage(String message){

        System.out.println(message);
    }
}
