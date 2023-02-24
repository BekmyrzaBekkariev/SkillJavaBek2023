package src4;

public class l4l6 {
    public static void main(String[] args) {
        // Строки и символы и подстроки
        //.length() - длинна строки
        String text = "";
        System.out.println(text.length());

        // .charAt(0) - получтить нужный символ по индексу 0 - индекс
        String text1 = "Как дела?";
        System.out.println(text1.charAt(0));

        // Есть код символа
        char c = 'R';
        int code = (int) c;
        System.out.println(code);

        // Спец символы
        // \n - перенос строки
        // \t - табуляция 4 пробела
        // \u20AC - спец сиволы (евро)

        String text2 = "Какой-то \n\tтекст\n\t\t\u20AC";
        System.out.println(text2);

        String Newtext = "555";
        double numinteger = Double.parseDouble(Newtext);
        System.out.println(Newtext);
    }

}
