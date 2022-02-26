package ru.vadlit.infoproviderdiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class InfoProviderDiscoveryApplication

fun main(args: Array<String>) {
    runApplication<InfoProviderDiscoveryApplication>(*args)
}
