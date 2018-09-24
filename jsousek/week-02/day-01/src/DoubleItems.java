import java.util.stream.IntStream;

public class DoubleItems {

    public static void main(String[] args) {

        int [] numList = IntStream.rangeClosed(3,7).toArray();

        for (int i = 0; i <numList.length ; i++) {
            numList[i]=numList[i]*2;

        }
        for (int i = 0; i < numList.length ; i++) {
            System.out.println(numList[i]);

        }

    }
}
// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
