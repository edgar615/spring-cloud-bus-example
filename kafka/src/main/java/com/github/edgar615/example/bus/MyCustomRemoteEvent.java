package com.github.edgar615.example.bus;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class MyCustomRemoteEvent extends RemoteApplicationEvent {
    private String message;

    public MyCustomRemoteEvent() {
    }

    public MyCustomRemoteEvent(Object source, String originService, String message) {
        // source is the object that is publishing the event
        // originService is the unique context ID of the publisher
        super(source, originService);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public MyCustomRemoteEvent setMessage(String message) {
        this.message = message;
        return this;
    }

}

