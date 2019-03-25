package com.github.edgar615.example.bus;

import java.util.UUID;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.cloud.bus.endpoint.AbstractBusEndpoint;
import org.springframework.context.ApplicationEventPublisher;

@Endpoint(id = "event")
public class EventEndpoint extends AbstractBusEndpoint {

	public EventEndpoint(ApplicationEventPublisher context, String id) {
		super(context, id);
	}

	@WriteOperation
	public String event() {
    String data = UUID.randomUUID().toString();
    publish(new MyCustomRemoteEvent(data, getInstanceId(), data));
    return data;
	}

}
