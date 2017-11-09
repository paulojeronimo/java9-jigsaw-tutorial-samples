package com.paulojeronimo.services;

import java.util.ServiceLoader;

public interface MessageService {
  String sayHelloTo(String to);

  static MessageService getInstance() {
    ServiceLoader<MessageService> loader = ServiceLoader.load(MessageService.class);
    MessageService service = loader.iterator().next();
    if (service != null) {
      return service;
    } else {
      throw new RuntimeException("No provider for MessageService");
    }
  }
}
