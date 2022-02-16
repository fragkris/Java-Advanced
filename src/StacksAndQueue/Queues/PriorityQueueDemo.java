package StacksAndQueue.Queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //PriorityQueue<Integer>queue = new PriorityQueue<>();
        PriorityQueue<Integer>queue = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue).reversed()); //Може да се подрежда в низходящ ред

        queue.offer(69);
        queue.offer(13);
        queue.offer(73);
        queue.offer(42);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        //подрежда опашката по приоритет (възходящ ред(ако не е въведен Comparator)). Няма да работи с iter защото подрежда по индекса в Heap-a.


    }
}
