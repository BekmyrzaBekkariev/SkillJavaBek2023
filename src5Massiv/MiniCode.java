package src5Massiv;

public class MiniCode {
    public static void main(String[] args) {
        // Способы переборов Массивоов

        int[] ticketNumbers = new int[1000];

        int[] winTicket = new int[10];

        for (int i = 0; i < ticketNumbers.length; i++){
            int value = 1000000 + (int) Math.round(1000000 * Math.random());
            ticketNumbers[i] = value;
            if (i % 100 == 0) {
                winTicket[i / 100] = value;
            }
        }
        for (int winTicketNumber : winTicket){
            System.out.println(winTicketNumber);
        }




    }
}
