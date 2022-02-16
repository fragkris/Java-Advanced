package Generics.CustomList789;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>(); //ако горе има Лист, задължително трябва да има конструктор в който да се инициализира нов лист
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {

        T firstElement = this.elements.get(firstIndex);
        T secondElement = this.elements.get(secondIndex);

        this.elements.set(secondIndex, firstElement);
        this.elements.set(firstIndex, secondElement);
    }

    public int countGreaterThan(T element) {
        return (int) this.elements.stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
    }

    public List<T> getElements() {

        return this.elements;
    }

    public T remove(int index) {
        return this.elements.remove(index);
    }

    public boolean contains(T element) {
        return this.elements.contains(element);
    }

    public T getMax() {
        return this.elements.stream()
                .max((a, b) -> a.compareTo(b)).get();
    }

    public T getMin() {
        return this.elements.stream()
                .min(Comparable::compareTo).get();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T element : elements) {
            sb.append(String.format("%s: %s", element.getClass().getName(), element));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.size();
            }

            @Override
            public T next() {
                return elements.get(index++);
            }
        };
    }
}
