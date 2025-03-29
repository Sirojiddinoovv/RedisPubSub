package uz.nodir.redispubsubdemo.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

/**
 * Created by Nodir
 * on Date 29 март, 2025
 * Java Spring Boot by Davr Coders
 */

@Service
class RedisSubscribeService {

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)
    }

    /*
    "How does Redis know that the handleMessage method is the message handler?"
     Redis, via Spring Boot, uses the MessageListenerAdapter class,
     which by default looks for a method named handleMessage.
     */

    fun handleMessage(message: String) {
        log.info("Received message to listener from Redis: $message")
    }
}