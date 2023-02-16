package src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class l1l5 {
    public static void main(String[] args) throws IOException {
        // Параметры
        int maxOncomingSpeed = 60; // км/ч
        int speedFineGrade = 20; // km/h
        int finePerGrade = 1000; // RUB
        int criminalSpeed = 180; // km/h

        // ===============================

        System.out.println("Ведите скорость автомобиля: ");

        // Скорость автомабиля
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader( System.in))).readLine());
        if(oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции...");
        }
        else if(oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}
