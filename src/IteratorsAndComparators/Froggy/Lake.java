package IteratorsAndComparators.Froggy;

import IteratorsAndComparators.StackIterator.Node;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{

    private List<Integer>lake;

    public Lake(List<Integer> lake) {
        this.lake = lake;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}

