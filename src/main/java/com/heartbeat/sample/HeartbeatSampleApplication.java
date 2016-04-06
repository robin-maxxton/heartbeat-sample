package com.heartbeat.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class HeartbeatSampleApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(HeartbeatSampleApplication.class);
    ConfigurableApplicationContext applicationContext = app.run(args);
  }

}
