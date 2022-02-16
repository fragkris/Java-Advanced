package Generics.JarOfPickles;

import Generics.JarOfT.Jar;

public class Main {
    public static void main(String[] args) {

        Jar <Integer>jar = new Jar();
        jar.add(5);
        jar.add(6);
        jar.remove();

    }
}
