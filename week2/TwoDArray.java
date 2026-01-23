package week2;
public class TwoDArray {
    public static void main (String[] args){

        String [][] clothColors = new String[2][3];

        //row 1 ----- [row][column]
        clothColors[0][0] = "red";
        clothColors[0][1] = "blue";
        clothColors[0][2] = "green";
        
        //row 2 ----- [row][column]
        clothColors[1][0] = "orange";
        clothColors[1][1] = "yellow";
        clothColors[1][2] = "violet";

        for (int row1 = 0; row1 < clothColors.length; row1++){
            for (int row2 = 0; row2 < clothColors[row1].length;row2++){
                System.out.printf("%-8s", clothColors[row1][row2]);
            }
        System.out.println();
        }

    }
    
}
