package src5Massiv;

public class l5l1 {
    public static void main(String[] args) {
        // Массивы как создать
        // Допустим что 6 это этажи
        int[] roomCounts = new int[6];

        roomCounts[0] = 5; // в 0 этаже 5 комнат
        roomCounts[1] = 45;
        roomCounts[2] = 34;
        roomCounts[3] = 28;

        // Теперь можем распечатать
        for(int i = 0; i < roomCounts.length; i++){
            System.out.println(roomCounts[i]);
        }

        // Есть более удобный способ заполнения массива
        // Его длинна бует соответствовать количеству значений котрый будет перечислено
        int[] roomCounts2 = {4, 44, 34, 28};
        for (int i = 0; i < roomCounts2.length; i++){
            System.out.println(roomCounts2[i]);
        }

        // Ещё модно использовать как Строку
        String[] colors = {"Оранжевый", "Красный", "Жёлтый"};
        for (int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }

        // Можно из методов
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors1 = text.split(",?\\s+");
        for (int i = 0; i < colors1.length; i++){
            System.out.println(colors1[i]);
        }
    }
}
