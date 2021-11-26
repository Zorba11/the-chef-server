package com.zorba11.thechefserver.services.kafkaservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "chef_status";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        this.kafkaTemplate.send(TOPIC, message);
    }
}
