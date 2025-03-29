package uz.nodir.redispubsubdemo.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import uz.nodir.redispubsubdemo.service.RedisPublisher

/**
 * Created by Nodir
 * on Date 29 март, 2025
 * Java Spring Boot by Davr Coders
 */

@RestController
@RequestMapping("/api/v1/message")
class RedisController(
    private val publisher: RedisPublisher
) {

    @PostMapping("/publish")
    fun publishMessage(@RequestParam message: String): ResponseEntity<String> {
        publisher.publish(message)

        return ResponseEntity.ok("Published message")
    }
}