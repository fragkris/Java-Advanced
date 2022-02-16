package SetsAndMapsAdvanced.Sets;

import java.util.*;

public class demoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        //Set<Integer> set = new LinkedHashSet<Integer>();
        //Set<Integer> set = new TreeSet<Integer>();

        //Set пази данни от един тип. Елементите трябва да са уникални, т.е не може да се повтарят

        set.add(13);
        set.add(13); //второто 13 няма да се добави

        boolean isAdded = set.add(13);


        System.out.println(isAdded);

    }
}
