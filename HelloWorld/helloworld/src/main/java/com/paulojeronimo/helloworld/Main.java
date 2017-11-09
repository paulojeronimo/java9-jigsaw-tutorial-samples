package com.paulojeronimo.helloworld;

import static com.paulojeronimo.utils.Message.*;
import com.paulojeronimo.utils.Message;
import com.paulojeronimo.services.MessageService;

public class Main {
  public static void main(String[] args) {
    String to = args.length > 0 ? args[0] : "World";
    System.out.println(MessageService.getInstance().sayHelloTo(to));

    MessageService xmlMessageService = s -> String.format("<message>%s</message>", sayHelloTo(s));
    System.out.println("XML format: " + xmlMessageService.sayHelloTo(to));
  }
}
