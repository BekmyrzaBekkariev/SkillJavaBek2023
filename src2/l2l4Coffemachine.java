package src2;
public class l2l4Coffemachine { // Это класс
    public static void main(String[] args) {
        // psvm + Enter = public static void main(String[] args) {}  -  Это МЕТОД
        // sout + Enter = System.out.println();
        int moneyAmount = 1000;

        int cappucinoPrice = 80;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = true;

        boolean canBuyAnything = true;

        boolean moneyEnoughForCappucino = moneyAmount >= cappucinoPrice;

        // && = и
        // || = или
        // ! = не

        if (moneyEnoughForCappucino && isMilkEnough) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }
        if (moneyAmount >= lattePrice && isMilkEnough == true) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }
        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить експрессо");
            canBuyAnything = true;
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }
//        if (canBuyAnything == true) {
//            System.out.println("Недостаточно средств");
//        }
        // Есть тернарный оператор это условие но по короче
        System.out.println(canBuyAnything ? "Выберите напиток" : "Не достаточно средств");
    }
}
