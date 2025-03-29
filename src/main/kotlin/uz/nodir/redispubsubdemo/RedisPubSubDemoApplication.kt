package uz.nodir.redispubsubdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisPubSubDemoApplication

fun main(args: Array<String>) {
    runApplication<RedisPubSubDemoApplication>(*args)
}
