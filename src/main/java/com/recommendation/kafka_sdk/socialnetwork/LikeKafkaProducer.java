package com.recommendation.kafka_sdk.socialnetwork;

import com.recommendation.kafka_sdk.dto.LikeKafkaMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LikeKafkaProducer {

    @Autowired
    KafkaTemplate<String,LikeKafkaMessage> likeKafkaTemplate;

    public void sendLikeKafkaMessage(LikeKafkaMessage likeKafkaMessage){
        likeKafkaTemplate.send("LIKE",likeKafkaMessage);
    }


}
