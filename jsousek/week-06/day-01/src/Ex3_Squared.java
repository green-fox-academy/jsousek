import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class Ex3_Squared {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        Function <Integer, Integer> square = n -> n * n;

        numbers = numbers.stream().filter(n -> n > 0).
                map(n -> n*n).
                collect(toList());

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
