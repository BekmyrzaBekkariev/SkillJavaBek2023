package src5Massiv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class l5l8 {
    public static void main(String[] args) {
        // Набор уникальных элементов

        // Есть разные колекции Один из них был List
        // Второй Hashset - НЕ упорядоченный

        ArrayList<String> list = new ArrayList<>();

        HashSet<String> words = new HashSet<>();

        words.add("Перовое");
        words.add("Второе");
        words.add("Третье");
        words.add("Второе");

        for (String item : words){
            System.out.println(item);
        }

        // Поиск элемента Вот и почему HashSet Удобен
        // Если бы было милион элементов то тамдолго бы лобы а тут все хорошо
        System.out.println(words.contains("Второе"));

        // Есть ещё TreeSet - он уже упорядоченный
        System.out.println("---------------");
        TreeSet<String> wordtree = new TreeSet<>();
        wordtree.add("Первое");
        wordtree.add("Второе");
        wordtree.add("Третье");
        wordtree.add("Второе");

        for (String tree : wordtree) {
            System.out.println(tree);
        }
        System.out.println(wordtree.contains("Третье")); // Тоже можно с ним
    }

}
