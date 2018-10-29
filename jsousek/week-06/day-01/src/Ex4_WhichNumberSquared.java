import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class Ex4_WhichNumberSquared {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        Function<Integer, Integer> squared = n -> n * n;

        numbers = numbers.stream().
                filter(n -> (n * n > 20)).
                collect(toList());

        for(int i : numbers){
            System.out.println(i);
        }

    }
}
