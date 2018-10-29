import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex7_FrequencyOfChar {
    public static void main(String[] args) {
        String testString = "HollaHolla";
        Map<Character, Long> charFrequency = testString.chars().
                mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Set<Map.Entry<Character,Long>> hashSet = charFrequency.entrySet();

        for(Map.Entry entry:hashSet ) {
            System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
        }
    }
}
