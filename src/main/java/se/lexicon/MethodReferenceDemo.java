package se.lexicon;

import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.function.ToDoubleBiFunction;

public class MethodReferenceDemo {

  public static int getRandomNumber(int max) {
    Random random = new Random();
    return random.nextInt(max);
  }

  public static void main(String[] args) {

    IntUnaryOperator randomNUmberLambda = (num) -> getRandomNumber(num);
    System.out.println(randomNUmberLambda.applyAsInt(1000));


    IntUnaryOperator randomNUmberMR = MethodReferenceDemo::getRandomNumber;
    System.out.println(randomNUmberMR.applyAsInt(1000));


    Calculator calculator = new Calculator();
    ToDoubleBiFunction<Double, Double> additionLambda = (n1,n2) -> calculator.addition(n1, n2);
    ToDoubleBiFunction<Double, Double> additionMR = calculator::addition;

    System.out.println(additionLambda.applyAsDouble(10.0,20.0));
    System.out.println(additionMR.applyAsDouble(10d,20.0));




  }

}
