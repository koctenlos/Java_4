import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Home_Work_04 {
    public static void main(String[] args) {
        // Задача 1:
        // LinkedList<Integer> list = createRandList();
        // System.out.println("Исходный список " + list);
        // list = turnList(list);
        // System.out.println("Первый метод " + list);
        // list = turnList2(list);
        // System.out.println("Второй метод " + list);

        // Задача 2:
        // task2();

        // Задача 3: 
        // LinkedList<Integer> list = createRandList();
        // System.out.println(list);
        // System.out.println("Через for each: " + sumList(list));
        // System.out.println("Через итератор: " + sumIterator(list));
    }

    static LinkedList<Integer> createRandList() {
        LinkedList<Integer> listStart = new LinkedList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите размер списка: ");
        int length = scan.nextInt();
        scan.close();
        for (int i = 0; i < length; i++) {
            listStart.add(rand.nextInt(100));
        }
        return listStart;
    }

    static LinkedList<Integer> turnList(LinkedList<Integer> list) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        */
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;   
    }

    static LinkedList<Integer> turnList2(LinkedList<Integer> list) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        */
        Collections.reverse(list);
        return list;
    }

    static void task2() {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди, 
        dequeue() - возвращает первый элемент из очереди и удаляет его, 
        first() - возвращает первый элемент из очереди, не удаляя.
        */
        Queue<Integer> queue = new LinkedList<>();
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.enqueue(queue, 1); // добавили число в конец очереди
        myLinkedList.enqueue(queue, 2); // добавили число в конец очереди
        myLinkedList.enqueue(queue, 3); // добавили число в конец очереди
        myLinkedList.enqueue(queue, 4); // добавили число в конец очереди
        myLinkedList.enqueue(queue, 5); // добавили число в конец очереди
        myLinkedList.enqueue(queue, 6); // добавили число в конец очереди
        System.out.println("Очередь: " + queue); // [1, 2, 3, 4, 5, 6]
        int number = myLinkedList.dequeue(queue);
        System.out.println("Присвоен первый элемент очереди = " + number); // Выведет 1 и удалит ее из очереди
        System.out.println("Первый элемент очереди удален " + queue); // [2, 3, 4, 5, 6]
        System.out.println("Первый элемент очереди = " + myLinkedList.dequeue(queue)); // аналогично, выведет 2 и удалит ее из очереди
        System.out.println("Первый элемент очереди удален " + queue); // [3, 4, 5, 6]
        int num = myLinkedList.first(queue); // присвоит 3 не удаляя ее из очереди
        System.out.println("Присовен первый элемент очереди " + num); // 3 
        System.out.println("Первый элемент очереди не удален " + queue); // [3, 4, 5, 6] - 3 не удалена
        System.out.println("Присовен первый элемент очереди " + myLinkedList.first(queue)); // 3
        System.out.println("Первый элемент очереди не удален " + queue); // [3, 4, 5, 6]
    }

    static int sumList(LinkedList<Integer> list) {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        */
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;

    }

    static int sumIterator(LinkedList<Integer> list){ 
        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }
}