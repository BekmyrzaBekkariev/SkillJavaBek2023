package src5Massiv;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class l5l6 {
    public static void main(String[] args) {
        // Списки элементов
        ArrayList<String> todoList = new ArrayList<>(); // Вот так и создается Лист
        ArrayList<String> todoList1 = new ArrayList<>();
        // Добовляем
        todoList.add("Первое наше дело");

        // у add есть 2 варианта
        // 1) Просто вставить строку
        // 2) Указать index на какую строку можно поставить
        todoList.add(1, "Второе дело");
        todoList.add(0, "Я заменил ИУУУ");


        // У Листа не length a size()
        for (int i = 0; i < todoList.size(); i++) {

            // Получаем с помощью get();
            System.out.println(todoList.get(i));
        }

        // можно и использовать в цикле :
        for (String item : todoList) {
            System.out.println(item);
        }


        // Но есть ещё КОРОТКИЙ способ

        ArrayList<String> todoList2 = new ArrayList<>(){{
            add("Первое дело Легкого способа");
            add("Второе дело Легкого способа");
        }};
        todoList2.add("Третье дело Легкого способа ");

        // Можно удолять их
        todoList2.remove(0);

        for (String item2 : todoList2){
            System.out.println(item2);
        }

    }
}
