package uz.nodir.redispubsubdemo.service

import org.slf4j.LoggerFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.listener.ChannelTopic
import org.springframework.stereotype.Service

/**
 * Created by Nodir
 * on Date 29 март, 2025
 * Java Spring Boot by Davr Coders
 */

@Service
class RedisPublisher(
    private val channelTopic: ChannelTopic,
    private val redisTemplate: RedisTemplate<String, String>
) {

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    fun publish(message: String) {
        val topicName = channelTopic.topic
        log.info("Publishing message to topic: $topicName")

        redisTemplate.convertAndSend(topicName, message)
        log.info("Published message: $message")
    }
}