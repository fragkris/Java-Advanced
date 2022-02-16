package Generics.JarOfT;

import java.util.ArrayDeque;

public class Jar<T>{
    private ArrayDeque<T>stack;

    public Jar(){
        this.stack=new ArrayDeque<>();
    }
    public void add(T e){
        this.stack.push(e);
    }
    public T remove(){
        return this.stack.pop();
    }
}
