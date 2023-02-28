package src5Massiv;

public class l5l3 {
    public static void main(String[] args) {
        // Обход массивов в обратном порядке

        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors1 = text.split(",?\\s+");
        for (int i = colors1.length - 1; i >= 0; i--){
            if (i > 0 && colors1[i].equals(colors1[i - 1])){
                continue;
            }
            System.out.println(colors1[i]);
        }
    }
}
