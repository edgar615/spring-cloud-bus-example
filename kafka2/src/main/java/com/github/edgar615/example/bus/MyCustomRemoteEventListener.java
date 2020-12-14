package com.github.edgar615.example.bus;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyCustomRemoteEventListener {

  @EventListener
  public void ack(MyCustomRemoteEvent myCustomRemoteEvent) {
    System.out.println(myCustomRemoteEvent);
  }
}
