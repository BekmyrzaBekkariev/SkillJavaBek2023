package src5Massiv;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniCode2 {
    public static void main(String[] args) {
        // Создадим программу которая
        // Вводишь Товары = и показывает что сколько взял
        // И в конце набираем List
        // И показывает

        // Можно и использовать TreeMap - то тогда будет
        // Показыватся в алфовитном порядке
        // Круто

        HashMap<String, Integer> good2count = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        for(;;)
        {
            String goodName = scanner.nextLine();
            if (goodName.equals("List")) {
                printMap(good2count);
                continue;
            }
            int count = 1;
            if (good2count.containsKey(goodName)) {
                count = good2count.get(goodName) + 1;
            }
            good2count.put(goodName, 1);
        }
    }

    // Создадим отдельный метод ВАУ
    public static void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " =>" + map.get(key));
        }

    }
}
