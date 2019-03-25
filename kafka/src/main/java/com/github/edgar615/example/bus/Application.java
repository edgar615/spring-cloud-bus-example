package com.github.edgar615.example.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.github.edgar615.**")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public EventEndpoint eventEndpoint(ApplicationContext context, BusProperties bus) {
    return new EventEndpoint(context, bus.getId());
  }
}
