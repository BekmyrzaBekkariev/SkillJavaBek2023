// ЦЫКЛЫ

package src2;


public class l2l5 {
    // Напишем код который повторяет числа
    public static void main(String[] args) {

        // Есть
        // Инкримент i++
        // Дикримент i--

        // i = i + 2 = Будет показывать только четные числа
        // i += 2 - Точно также
        // i += 3 - будет показывать НЕЧЕТНЫЕ

        // Это Инкримент i++
        for(int i = 0; i < 10; i++  ) {
            System.out.println(i);
        }
        System.out.println("============");
        //Это Дикримент i--
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // Практическая работа

        for (int age = 15; age < 40; age++) {
            System.out.println(age);
        }


        // ТПЕРЬ ЦИКЛ while отличается тем что есть условие


        // Ещё есть цикл do{}
//        do {
//            System.out.println("YYY");
//        }

        // Но они бесконечны

        // Можно и так
//        while (true){
//            System.out.println("YYY");
//        }

        // Можно ещё и for так сделать
        // Будет бесконечным
//      Можно и так for(;;)
//        for (int i = 0;; i++ ){
//            System.out.println("Бесконечно");
//        }


    }
}
