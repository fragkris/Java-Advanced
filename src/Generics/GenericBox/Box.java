package Generics.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>(); //ако горе има Лист, задължително трябва да има конструктор в който да се инициализира нов лист
    }
    public void add(T element){
        this.elements.add(element);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (T element : elements) {
              sb.append(String.format("%s: %s", element.getClass().getName(), element));
              sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
