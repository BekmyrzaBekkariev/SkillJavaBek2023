
// Напишем код с помощью Цикла While проверка пороли
package src;

import java.util.Scanner;

public class l2l5WhilePassword {
    public static void main(String[] args) {
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in);
        while (pinCode != secretPinCode) {
            if(pinCode == -1){
                System.out.println("Ведите пароль");
            }
            else {
                System.out.println("Пароль введён не верно. Ведите пароль.");
            }
            pinCode = scanner.nextInt();
        }

        System.out.println("Пароль введён не верно!!!");
    }
}
