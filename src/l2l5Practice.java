
package src;

public class l2l5Practice {
    public static void main(String[] args) {
        // Практическая работа в уроку 2.5

        for (int age = 10; age < 50; age++) {
            System.out.print(age + "лет: вы можете: ");
            if (age == 15) {
                System.out.print("Наслаждайтесь");
            }
            if (age > 16 && age < 18) {
                System.out.print("Иметь ученические права,");
            }
            if(age >= 18) {
                System.out.print("Иметь обычные права");
            }
            if (age >= 35 && age <= 44){
                System.out.print("Вы можете боллатировать в президенты");
            }
            if(age >= 45 ) {
                System.out.print("Вы уже опытный");
            }
            if(age < 15){
                System.out.print("Кто ты воин?");
            }
        }
    }
}
