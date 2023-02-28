package src5Massiv;

public class l5l4 {
    public static void main(String[] args) {
        // Массив Массивов int[][]
        // Представим Школу а в школе классы и в классах ученики и у каждого есть оценки.

        int[][] studentsMarks = {
                {4, 5, 1, 2, 4},
                {3, 4, 5, 2, 2, 2, 3},
                {2, 3, 4, 5},
                {3, 5, 3, 2, 2, 2, 3}
        }; // Теперь мы должы пробедать по ним for

        for (int i = 0; i < studentsMarks.length; i++){
            System.out.println("Class " + i + " (" + studentsMarks[i].length + " students):");
            // Мы с i посчитали количество элементов внутри
            for (int j = 0; j < studentsMarks[i].length; j++){
                System.out.println("\t" + studentsMarks[i][j]);
            }
        }
    }
}
