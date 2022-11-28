package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {

  public static void main(String[] args) {

    Supplier<Double> randomValue = () -> Math.random();
    Supplier<String> randomUUID = () -> UUID.randomUUID().toString();
    System.out.println(randomUUID.get());

    System.out.println("----------------");
    System.out.println(takeDecimalInput.get());

  }


  static Supplier<Double> takeDecimalInput = () -> {
    double number = 0;
    while (true) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a number: ");
      try {
        number = scanner.nextDouble();
        break;
      } catch (InputMismatchException e) {
        System.out.println("Number is not valid!");
      }
    }
    return number;
  };


}
