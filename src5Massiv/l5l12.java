package src5Massiv;

import java.util.ArrayList;
import java.util.Collections;

public class l5l12 {
    public static void main(String[] args) {
        // Поиск  и Сортировка

        // Для Листов, для колекции - есть Класс Collections методы
        // .sort  .binarySearch

        ArrayList<String> items = new ArrayList<>();
        Collections.sort(items);
        int index = Collections.binarySearch(items, "искомая строка");

    }
}
