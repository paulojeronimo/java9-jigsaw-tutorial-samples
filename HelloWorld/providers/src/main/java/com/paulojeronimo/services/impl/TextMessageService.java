package com.paulojeronimo.services.impl;

import com.paulojeronimo.utils.Message;
import com.paulojeronimo.services.MessageService;

public class TextMessageService implements MessageService {
  @Override
  public String sayHelloTo(String to) {
    return Message.sayHelloTo(to);
  }
}
