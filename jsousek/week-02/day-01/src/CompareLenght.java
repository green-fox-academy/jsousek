import java.util.stream.IntStream;

public class CompareLenght {
    public static void main(String[] args) {

        int[] p1 = IntStream.rangeClosed(1, 3).toArray();


        int[] p2 = IntStream.rangeClosed(4, 5).toArray(); //!! fills an Array with closed range numbers, JAVA 8 only.

        //loop below returns all values in an array

        for (int i = 0; i < p1.length; i++) {
            System.out.println(p1[i] + "");

        }
        if (p1.length < p2.length) {

            System.out.println(true);

        } else {

            System.out.println(false);
        }
    }
}


// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
