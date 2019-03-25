package com.github.edgar615.example.bus;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BusRestController implements ApplicationEventPublisherAware {

  private ApplicationEventPublisher publisher;

  @Autowired
  private BusProperties busProperties;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.publisher = applicationEventPublisher;
  }

  @PostMapping("/event")
  public String event() {
    String data = UUID.randomUUID().toString();
    // context.getId()不是cloud-bus的实例ID
    RemoteApplicationEvent event = new MyCustomRemoteEvent(this, busProperties.getId(), data);
    publisher.publishEvent(event);
    return data;
  }
}
