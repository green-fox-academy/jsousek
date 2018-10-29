import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6_StringStartsEndsWith {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        cities = cities.stream().
                map(c -> c.replace("\\s", "")).
                filter(c -> c.endsWith("I") && c.charAt(0) == ('A')).
                collect(Collectors.toList());

        for(String s : cities){
            System.out.println(s);
        }






    }
}
