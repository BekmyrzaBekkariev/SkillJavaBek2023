package src4;

public class l4l1 {
    // Тема: чем отличается Обьекты от Примитивов
    public static void main(String[] args) {

        int vasyaAge = 25;
        int mashaAge = 24;

        System.out.println(vasyaAge > mashaAge); // True
        // Просто так сравнивать обьекты нельзя
        // Если

        int vasya2Age = 35;
        int masha2Age = vasya2Age;
        masha2Age++;
        System.out.println(vasya2Age);
        System.out.println(masha2Age);
        // Мы можем сказать ну естественно, но в видео покозало
        // что вот ссылка на один обьект с 2 переменными и их
        // и их значения равны. но 2 переменную изменили на +100
//        Сat cat = new Cat();
//        Cat cat2 = cat;
//        cat2.drink(100);
//        System.out.println(cat.getWeight());
//        System.out.println(cat2.getWeight());

        // Если сравнивать БОЛЬШИЕ ЧИСЛА ТО МОЖЕТ ошибится тогда нужно исрользовать методы
        Integer vasya3Age = 23423422;
        Integer masha3Age = 23423422;
        System.out.println(vasya3Age == masha3Age); // False
        //Если же сравнивать маленькие то True

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

    }
}
