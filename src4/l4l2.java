package src4;

public class l4l2 {
    // Тема: чем отличается Обьекты от Примитивов
    public static void main(String[] args) {

        Integer age = 5; // Это почти примитив
        // Преоброзование Примитива в Обьект то Boxing

        Integer age2 = 5;
        int mishaAge = 7;
        System.out.println(age2 < mishaAge); // Здесь происходит Unboxing


        //
        double a = 24.0;
        double b = 0.1;
        System.out.println(a * b);
        // java.math.BigInteger(a*b); - вот они нужны

        // Преоброзование сток в число и обратно
        String number = "213.234";

        double doubleNumber = Double.parseDouble(number);
        System.out.println(doubleNumber);

        // И обратно с помощю метода toString()
        Integer numa = 3245665;
        System.out.println(numa.toString());


        for (int i = 10; i>=0; i--){
            System.out.println(i);
        }

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
