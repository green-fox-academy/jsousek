import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        //System.out.println(makingMatches(girls, boys));
        System.out.println(makingMatches(girls, boys));
    }
//its only merges them together
    public static ArrayList makingMatches (ArrayList aList, ArrayList bList){
        ArrayList<String> merged =new ArrayList<String>();

        merged.addAll(aList);
        merged.addAll(bList);

        return merged;
    }
}