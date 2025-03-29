package uz.nodir.redispubsubdemo.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.listener.ChannelTopic
import org.springframework.data.redis.listener.RedisMessageListenerContainer
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter
import uz.nodir.redispubsubdemo.service.RedisSubscribeService

/**
 * Created by Nodir
 * on Date 29 март, 2025
 * Java Spring Boot by Davr Coders
 */

@Configuration
class RedisConfiguration {

    @Bean
    fun myTopic() = ChannelTopic("my-channel-topic")

    @Bean
    fun messageListener(subscriber: RedisSubscribeService) =
        MessageListenerAdapter(subscriber)

    @Bean
    fun redisContainer(
        connectionFactory: RedisConnectionFactory,
        listenerAdapter: MessageListenerAdapter,
        topic: ChannelTopic
    ): RedisMessageListenerContainer {
        val container = RedisMessageListenerContainer()
        container.setConnectionFactory(connectionFactory)
        container.addMessageListener(listenerAdapter, topic)
        return container
    }
}