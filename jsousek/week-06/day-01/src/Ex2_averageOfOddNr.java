import com.google.common.math.DoubleMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex2_averageOfOddNr {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));


        OptionalDouble averageOfList = numbers.stream().filter(n -> n % 2 != 0).
                mapToDouble(n -> n).
                average();

        double sumUsingForE = 0;
        for (double i : numbers) {
            if (i % 2 != 0){
            sumUsingForE += i;
            }
        }

        System.out.println(averageOfList);
        System.out.println(sumUsingForE/6);

    }
}
