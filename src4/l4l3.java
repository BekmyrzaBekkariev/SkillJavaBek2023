package src4;
public class l4l3 {
    // Тема: чем отличается Обьекты от Примитивов
    public static void main(String[] args) {

        // Преоброзование сток в число и обратно
        String number = "213.234";

        double doubleNumber = Double.parseDouble(number);
        System.out.println(doubleNumber);

        // И обратно с помощю метода toString()
        Integer numa = 3245665;
        System.out.println(numa.toString());

        // Есть такое штука
        int i = 10;
        int aa = i++;
        System.out.println("a=" + aa);
        System.out.println("i=" + i);
        System.out.println("----------------");
        int i1 = 10;
        int a1 = ++i1;
        System.out.println("a=" + a1);
        System.out.println("i=" + i1);

        // Метод из Math
        // 1) Округление
        double value = 2.7;
        int roundValue = (int) Math.round(value);
        System.out.println(roundValue);

        // Корень
        System.out.println(Math.sqrt(9));
        // Степень
        System.out.println(Math.pow(9,0.5));
    }
}
