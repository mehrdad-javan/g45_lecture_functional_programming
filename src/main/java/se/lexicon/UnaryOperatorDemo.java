package se.lexicon;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

  public static void main(String[] args) {

    Function<String, String> toLowerCase =  (param) -> param.toLowerCase();

    UnaryOperator<String> toUpperCase = (param) -> param.toUpperCase();

    System.out.println(toLowerCase.apply("ABCD"));
    System.out.println(toUpperCase.apply("abc"));


  }
}
