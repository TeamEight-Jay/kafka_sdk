package com.recommendation.kafka_sdk.contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SubscribeKafkaProducer {

    @Autowired
    KafkaTemplate<String,SubscribeContestKafkaMessage> subscribeContestKafkaTemplate;

    public void sendSubscribeKafkaMessage(SubscribeContestKafkaMessage subscribeContestKafkaMessage)
    {
        subscribeContestKafkaTemplate.send("SUBSCRIBE",subscribeContestKafkaMessage);
    }
}
