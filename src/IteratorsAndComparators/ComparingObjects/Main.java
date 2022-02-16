package IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person>people = new ArrayList<>();
        String input= scanner.nextLine();

        while (!input.equals("END")){
            String [] tokens = input.split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];
            Person person = new Person(name,age,town);
            people.add(person);
            input=scanner.nextLine();
        }
        int n = Integer.parseInt(scanner.nextLine());

        Person personSearched = people.get(n-1);



        int countEquals = 0;
        for (Person person : people) {
            if (personSearched.compareTo(person)== 0){
                countEquals++;
            }
        }
        if (countEquals==1){
            System.out.println("No matches");
        }else {
            System.out.println(countEquals + " " + (people.size() -countEquals) + " " + people.size());
        }
    }
}
