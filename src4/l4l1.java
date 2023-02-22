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
    }
}
