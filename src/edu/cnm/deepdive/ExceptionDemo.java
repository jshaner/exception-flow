package edu.cnm.deepdive;

import java.io.IOException;

public class ExceptionDemo {

  public static void main(String[] args) {
    try (MyResource myRes = new MyResource()) {
      System.out.println("Trying...");
      // throw new RuntimeException("Testing the message");
    } catch (IllegalStateException e) {
      System.out.println("Catching " + e.getClass().getSimpleName());
      System.out.println(e.getMessage());
      throw new RuntimeException("Testing the message");
    } catch (RuntimeException e) {
      System.out.println("Catching...");
      System.out.println(e.getMessage());
      throw e;
    } finally {
      System.out.println("Finally...");
    }
    System.out.println("Done!");
  }

}
