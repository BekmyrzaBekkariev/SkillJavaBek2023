package src4;

public class l4l7 {
    public static void main(String[] args) {
        // Конкотанация - это присоединение строк в одну
        String name = "Василий";
        String surname = "Григорьевич";
        System.out.println(name + " " + surname);

        // Замена конкотонации лучше быстрее и легкче
        // Этo StringBuilder
        String name1 = "Омар";
        String surname1 = "Васильевич";

//        // Напишим цикл который проверяет время
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100; i++){
//            name1 += surname1;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Duration" + (end - start) + " ms");
//        System.out.println(name1.length());


        // Теперь применим StringBuilder - который позволяет добовлять к ним строки

        StringBuilder builder = new StringBuilder();
        builder.append(name1);

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++){
            builder.append(surname1);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Duration" + (end1 - start1 ) + " ms");
        System.out.println(builder.length());
    }
}
