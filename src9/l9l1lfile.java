package src9;

import java.io.File;
import java.io.FileInputStream;

public class l9l1lfile {
    public static void main(String[] args) {
        // Работа с Файлами

        File file = new File("D:/SkillJavaBek2023/src9/text.txt");
        System.out.println(file.length());

        System.out.println(file.lastModified());

        System.out.println(file.delete());

        System.out.println(file.isFile());

        // Чтение файлов с помощью FileInputStream
            FileInputStream is = new FileInputStream("D:/SkillJavaBek2023/src9");

    }
}
