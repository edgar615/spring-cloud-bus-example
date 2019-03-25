package com.github.edgar615.example.bus;

import org.springframework.cloud.bus.event.AckRemoteApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AckRemoteApplicationEventListener {

  @EventListener
  public void ack(AckRemoteApplicationEvent ackRemoteApplicationEvent) {
    System.out.println(ackRemoteApplicationEvent);
  }
}
