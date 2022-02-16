package IteratorsAndComparators;

import java.util.ArrayList;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String>strings= new ArrayList<>();
    print ("hello", "Java", "world");
    print ("hello", "Java");
    print ("hello");
    print ();

    }
    public static void print(String... args){
        if (args.length!=0){
            System.out.println(String.join(System.lineSeparator(), args));
        }else {
            System.out.println("Nothing to print");
        }
    }
}
//a > b -> 1
//a == b -> 0
//a < b -> -1
//comparator works