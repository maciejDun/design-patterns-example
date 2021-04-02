package com.dunin.observer;

import java.util.UUID;

public interface Observer {

    void update();

    default String sendData() {
        return UUID.randomUUID().toString();
    }
}
