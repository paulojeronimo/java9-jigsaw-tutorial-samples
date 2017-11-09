package com.paulojeronimo.services.impl;

import com.paulojeronimo.utils.Message;
import com.paulojeronimo.services.MessageService;

public class HtmlMessageService implements MessageService {
  @Override
  public String sayHelloTo(String to) {
    return String.format("<b>%s</b>", Message.sayHelloTo(to));
  }
}
