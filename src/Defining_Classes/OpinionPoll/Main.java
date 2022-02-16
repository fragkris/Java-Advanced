package Defining_Classes.OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String []input = scanner.nextLine().split("\\s+");
            String name =input[0];
            int age = Integer.parseInt(input[1]);
            if (age>30){
                Person person = new Person(name, age);
                people.add(person);
            }

        }
        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
