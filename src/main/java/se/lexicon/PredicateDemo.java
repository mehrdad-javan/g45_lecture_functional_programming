package se.lexicon;

import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) {
    Predicate<Integer> isPositive = (number) -> {
      if (number > 0) {
        return true;
      } else {
        return false;
      }
    };

    Predicate<Integer> isGraterThanTen = (number) -> number > 10;
    Predicate<Integer> isLessThan20 = (number) -> number < 20;


    Integer number1 = 100;
    boolean result = isPositive.test(number1); // true
    System.out.println(result);

    System.out.println(isGraterThanTen.test(5)); // false

    Predicate<Person> isLeapYear = (p) -> p.getBirthDate().isLeapYear();
    Person person = new Person(
            1,
            "Test",
            "Test",
            LocalDate.parse("2022-01-01"),
            true);
    System.out.println(isLeapYear.test(person));

    System.out.println(isGraterThanTen.and(isLessThan20).test(15));

  }

}
