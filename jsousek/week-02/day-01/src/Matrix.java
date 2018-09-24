import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        // declare array
        int [] [] matrix = new int[4][4];

        //nested loops, one for lines, second for columns
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                if (i == j){
                    matrix[i] [j]=1;
                }

            }
            //print fnc is still within the for loop
            System.out.println(Arrays.toString(matrix[i]));
        }





    }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output