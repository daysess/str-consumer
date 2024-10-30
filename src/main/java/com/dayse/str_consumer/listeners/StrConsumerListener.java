package com.dayse.str_consumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {
    
    @KafkaListener(groupId = "group-1", 
    topicPartitions = {
        @TopicPartition(topic = "str-topic", partitions = {"0"})
    }, containerFactory = "strContainerFactory")
    public void listenerLog0(String message){
        log.info("LOG - Part 0 ::: Receive message {}", message);
    }

    @KafkaListener(groupId = "group-1", 
    topicPartitions = {
        @TopicPartition(topic = "str-topic", partitions = {"1"})
    }, containerFactory = "strContainerFactory")
    public void listenerLog1(String message){
        log.info("LOG - Part 1 ::: Receive message {}", message);
    }


}
