package se.lexicon;


import se.lexicon.interfaces.DoStringStuff;
import se.lexicon.interfaces.IntegerOperator;

public class LegacyCode {


  public static void main(String[] args) {
    ex3();

  }


  // Anonymous Inner Class example
  public static void ex1() {

    DoStringStuff concatOperator = new DoStringStuff() {
      @Override
      public String operate(String s1, String s2) {
        return s1.concat(s2);
      }
    };

    IntegerOperator additionOperator = new IntegerOperator() {
      @Override
      public Integer apply(Integer n1, Integer n2) {
        return n1 + n2;
      }
    };

  }


  // Moving Anonymous Inner classes to fields
  static DoStringStuff concatOperator = new DoStringStuff() {
    @Override
    public String operate(String s1, String s2) {
      return s1.concat(s2);
    }
  };

  static DoStringStuff getBiggestString = new DoStringStuff() {
    @Override
    public String operate(String s1, String s2) {
      if(s1.length()>= s2.length()) return s1;
      else return s2;
    }
  };

  static IntegerOperator additionOperator = new IntegerOperator() {
    @Override
    public Integer apply(Integer n1, Integer n2) {
      return n1 + n2;
    }
  };

  static IntegerOperator subtractionOperator = new IntegerOperator() {
    @Override
    public Integer apply(Integer n1, Integer n2) {
      return n1 - n2;
    }
  };




  public static void ex2() {
    System.out.println(concatOperator.operate("ABC", "DEF"));
    System.out.println(additionOperator.apply(10, 2));
  }


  public static String doStringStuff(String s1, String s2, DoStringStuff operator){
    return operator.operate(s1, s2);
  }

  public static Integer calcOperator(Integer n1, Integer n2, IntegerOperator operator){
    return operator.apply(n1,n2);
  }

  public static void ex3(){
    System.out.println(doStringStuff("ABC", "DEFG",concatOperator));
    System.out.println(doStringStuff("ABC", "DEFG",getBiggestString));

    System.out.println(calcOperator(10, 5, additionOperator));
    System.out.println(calcOperator(10, 5, subtractionOperator));
  }


}
