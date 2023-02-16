package src;
// Приложение которое показывает время
// Круто  ! но ничего не понятно
// Я написал русский вариант
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class l1l6 {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("hh:mm a dd/MM/yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }

}
