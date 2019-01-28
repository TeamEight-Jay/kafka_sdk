package com.recommendation.kafka_sdk.contest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class PlayQuestionKafkaProducer {

    @Autowired
    KafkaTemplate<String,PlayQuestionKafkaMessage> playQuestionKafkaTemplate;

    public void sendPlayQuestionKafkaMessage(PlayQuestionKafkaMessage playQuestionKafkaMessage)
    {
        playQuestionKafkaTemplate.send("PLAY_QUESTION",playQuestionKafkaMessage);
    }
}
