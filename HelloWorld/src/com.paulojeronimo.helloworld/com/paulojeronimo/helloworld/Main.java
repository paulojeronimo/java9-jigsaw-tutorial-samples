package com.paulojeronimo.helloworld;

import static com.paulojeronimo.utils.Message.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(
      sayHelloTo(args.length > 0 ? args[0] : "World"));
  }
}
