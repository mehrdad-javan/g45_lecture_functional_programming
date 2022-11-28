package se.lexicon;

import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

  public static void main(String[] args) {

    String[] words = {"I", "Love", "Java"};

    Function<String[], String> arrayToString = (arrayParam) -> {
      String sentence = "";
      for (String word: arrayParam){
        //sentence = sentence + word;
        sentence += word + " ";
      }
      return sentence;
    };

    System.out.println(arrayToString.apply(words));

    Function<Person, String> extractPersonName = person -> person.getFirstName() + " " + person.getLastName();

    Person person = new Person(1,"test", "test", LocalDate.parse("2020-01-01"), true);

    System.out.println(extractPersonName.apply(person));

    System.out.println("------------------");

    List<Person> personList = new ArrayList<>();
    personList.add(new Person(1, "Test1", "Test2", LocalDate.parse("2000-01-01"), false));
    personList.add(new Person(2, "Test2", "Test2", LocalDate.parse("2001-01-01"), false));
    personList.add(new Person(3, "Test3", "Test3", LocalDate.parse("2002-01-01"), false));
    personList.add(new Person(4, "Test4", "Test4", LocalDate.parse("2003-01-01"), false));

    List<String> names = new ArrayList<>();
    for (Person currentElement : personList){
      String fullName = extractPersonName.apply(currentElement);
      names.add(fullName);
    }

    names.forEach( name -> System.out.println(name));

  }
}
