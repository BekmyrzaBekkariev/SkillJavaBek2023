package src4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class l4l10lMUST {
    public static void main(String[] args) {
        // Календарь и метка времени

        //Мы можем так
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        // Класс Calendar
        Calendar calendar =  Calendar.getInstance();
        // можно добовлять
        calendar.add(Calendar.SECOND, 3);
        long timestamp = calendar.getTime().getTime();

        System.out.println(calendar.getTime());
    }
}
