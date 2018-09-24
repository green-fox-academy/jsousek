import java.util.stream.IntStream;

public class PrintAll {
    public static void main(String[] args) {

        int [] numbers = IntStream.rangeClosed(4,7).toArray();

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
    }
}
// - Create an array variable named `numbers`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `numbers`