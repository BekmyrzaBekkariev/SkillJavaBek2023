package src9;

import java.io.File;

public class l9l1 {
    public static void main(String[] args) {
        // Работа с Файлами

        File file = new File("D:/SkillJavaBek2023/src9/text.txt");
        System.out.println(file.length());

        System.out.println(file.lastModified());

        System.out.println(file.delete());

        System.out.println(file.isFile());

        // Чтение файлов с помощью FileInputStream
        // FileInputStream is = new FileInputStream("D:/SkillJavaBek2023/src9");

        System.out.println("О боже я почто что ничего не понимаю просто курс такой 16.03.23");

    }
}
