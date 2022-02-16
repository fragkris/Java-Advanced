package Generics.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar <Integer>jar = new Jar();

        jar.add(13);
        jar.add(21);

        jar.remove();
    }
}
