package activity1;

public class Week2Activity1 {
    public static void main(String[] args) {

        int[] theaterSeat = { 0, 0, 0, 0, 0, 0, 0, 0, };
        theaterSeat[2] = 1;
        for (int i = 0; i <= theaterSeat.length - 1; i++) {
            int seat = i + 1;
            System.out.println("Seat " + seat + " Status = " + theaterSeat[i]);
        }

        int availableSeat = theaterSeat.length;
        for (int a = 0; a < theaterSeat.length; a++) {
            if (theaterSeat[a] == 1) {
                availableSeat -= 1;
            }
        }

        System.out.println("There is " + availableSeat + " available seats");

    }

}
