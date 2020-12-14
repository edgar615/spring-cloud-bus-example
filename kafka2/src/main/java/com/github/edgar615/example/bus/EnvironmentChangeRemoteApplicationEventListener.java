package com.github.edgar615.example.bus;

import org.springframework.cloud.bus.event.AckRemoteApplicationEvent;
import org.springframework.cloud.bus.event.EnvironmentChangeRemoteApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentChangeRemoteApplicationEventListener {

  @EventListener
  public void ack(EnvironmentChangeRemoteApplicationEvent environmentChangeRemoteApplicationEvent) {
    System.out.println(environmentChangeRemoteApplicationEvent);
  }
}
