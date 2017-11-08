package com.paulojeronimo.helloworld;

public class Main {
  public static String sayHelloTo(String to) {
    return String.format("Hello, %s!", to);
  }

  public static void main(String[] args) {
    System.out.println(
      sayHelloTo(args.length > 0 ? args[0] : "World"));
  }
}
