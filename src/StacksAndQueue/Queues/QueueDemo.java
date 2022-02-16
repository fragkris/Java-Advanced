package StacksAndQueue.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Queues are FIFO (First In First Out)

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(13);
        queue.offer(42);
        queue.offer(69);
        queue.offer(73); // добавя елемент

        queue.poll();//премахва елемент

        /*
        ArrayDeque се ползва за Stack и Queue, разликата е кмандите които се ползват.
        При Опашка (Queue) .offer, .poll.

        При Стек, .push, .pop.

        Команди като .peak са общи
         */

        /*
        При опашките първото въведение се изкарва първо. Също като опашките на които се чака,
        първият наредил се, минава първи.
         */
        System.out.println();
        System.out.println(queue);
    }
}
/*
|13 //първият е премахнат
|42
|69
|73
 */