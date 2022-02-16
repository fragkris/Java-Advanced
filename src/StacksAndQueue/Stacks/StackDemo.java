package StacksAndQueue.Stacks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



//         Stacks are LIFO (Last In First Out)



//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(13);
//        number.add(42);
//        number.add(69);
//        number.add(73);
//
//        number.remove(0);  премахва числото на индекс 0 (13)
//
//        number.get();
//

        //така функционира лист

        ArrayDeque<Integer> stack= new ArrayDeque<>();
        stack.push(13);
        stack.push(42);
        stack.push(69);
        stack.push(73);
        //добавя в стека

        stack.pop();//премахва последното добавено(което стой най отгоре в стека) (73). Не може да се въведе индекс.

        stack.peek();//показва последния елемент в стека.
        /*
        Предимството на стека е, че при премахване на елементи от стека елементите не се пренареждат
        както при Листа. Иначе казано, ако в листа премахнем елемент 0 от 100, всички елементи се пренареждат
        с един индекс назад, което усложнява процеса с N на брой премествания. При стека имаме константна сложност.

         */


        /*
        ArrayDeque се ползва за Stack и Queue, разликата е кмандите които се ползват.
        При Опашка (Queue) .offer, .poll.

        При Стек, .push, .pop.

        Команди като .peak са общи
         */

        System.out.println(stack);

    }
}
/*
|73 //първият в стака (опоследният добавен) е премахнат
|69
|42
|13
 */