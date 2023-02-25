package src4;

public class l4l8 {
    public static void main(String[] args) {
        // Сравнение строк
        String name1 = "Василий";
        String name2 = "Дмитрий";

        // name1 == name2; // Вот так сравнивать и занкоми == ><
        // НЕЛЬЗЯ так-как переменные являются ссылками на обьект
        // .. Можно сравнивать Несколькими Методами

        // 1) .equals - true или falsе
        System.out.println(name1.equals(name2));

        // 2) .compareTo - числа, с учетом Больших букв
        // Допустим
        String nameV = "Василий";
        String nameV1 = "василий";

        System.out.println(nameV.compareTo(nameV1));
        // -32 - это не правильно так как они похожи и для токого случая есть compareToIgnoreCase

        // 2.1) .compareToIgnoreCase - числа, не с учетом Больших букв
        System.out.println(nameV.compareToIgnoreCase(nameV1));

    }
}
