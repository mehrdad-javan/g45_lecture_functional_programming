package se.lexicon;

import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.DoubleOperator;
import se.lexicon.interfaces.IntegerOperator;
import se.lexicon.interfaces.Printer;

public class LambdaDemo {


  public static String doStringStuff(String v1, String v2, DoStringStuff operator) {
    return operator.operate(v1, v2);
  }

  public static Integer calcOperator(Integer n1, Integer n2, IntegerOperator operator) {
    return operator.apply(n1, n2);
  }

  public static Double calcOperator(Double n1, Double n2, DoubleOperator operator) {
    return operator.apply(n1, n2);
  }

  static DoStringStuff concat = (str1, str2) -> str1.concat(str2);
  // http://tutorials.jenkov.com/java/ternary-operator.html
  // ternary operator
  static DoStringStuff getBiggestValue = (str1, str2) -> str1.length() >= str2.length() ? str1 : str2;
  static IntegerOperator addition = (num1, num2) -> num1 + num2;
  static IntegerOperator subtraction = (num1, num2) -> num1 - num2;
  static IntegerOperator multiplication = (num1, num2) -> num1 * num2;
  static DoubleOperator doubleAddition = (num1, num2) -> num1 * num2;

  static Printer displayMessage = msg -> System.out.println(msg);


  public static void main(String[] args) {
    System.out.println(doStringStuff("ABC", "DEFG", concat));
    System.out.println(doStringStuff("ABC", "DEFG", getBiggestValue));
    System.out.println(calcOperator(10, 5, addition));
    System.out.println(calcOperator(10.0, 5.0, doubleAddition));
    System.out.println(calcOperator(10, 5, subtraction));
    System.out.println(calcOperator(10, 5, multiplication));

    displayMessage.print("Hello Lambda!");

  }

}
