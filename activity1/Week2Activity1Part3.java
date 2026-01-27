package activity1;

public class Week2Activity1Part3 {

    public static void main(String[] args) {

        String[][] theater = new String[5][8];

        System.out.println("Theater Seating Chart (- = Available, x = Booked)");
        System.out.println();

        int totalBooked = 0;
        int totalAvailable = 0;
        int rows = 0;
        int columns = 0;

        for (rows = 0; rows < theater.length; rows++) {
            for (columns = 0; columns < theater[rows].length; columns++) {
                theater[rows][columns] = "-";

                theater[2][5] = "x";
                theater[0][0] = "x";

                System.out.print(" |" + theater[rows][columns] + "| ");

                if ("x".equals(theater[rows][columns])) {
                    totalBooked++;
                } else if ("-".equals(theater[rows][columns])) {
                    totalAvailable++;
                }
            }
            System.out.println();
        }

        System.out.println("Total number of booked seats: " + totalBooked);
        System.out.println("Total number of available seats: " + totalAvailable);
    }
}
