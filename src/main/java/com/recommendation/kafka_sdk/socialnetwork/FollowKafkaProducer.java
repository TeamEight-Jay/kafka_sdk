package com.recommendation.kafka_sdk.socialnetwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FollowKafkaProducer {

    @Autowired
    KafkaTemplate<String,FollowKafkaMessage> followKafkaTemplate;

    public void sendFollowKafkaMessage(FollowKafkaMessage followKafkaMessage){
        followKafkaTemplate.send("FOLLOW",followKafkaMessage);
    }

}
