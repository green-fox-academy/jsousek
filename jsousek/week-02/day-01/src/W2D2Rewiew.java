import java.util.ArrayList;
import java.util.HashMap;

public class W2D2Rewiew {
    public static void main(String[] args) {
        ArrayList myList =new ArrayList();
        ArrayList<Integer> listOfINT = new ArrayList<>();

        listOfINT.add(5);
        listOfINT.add(6);

        System.out.println(listOfINT.size());
        System.out.println(listOfINT.get(1));

        myList.addAll(listOfINT);
        System.out.println(myList);

        ArrayList<String>nameList = new ArrayList<>();

        //nameList.add(1, "john");
        //nameList.add(2, "Ted");

        // it  removes first element it finds
        for (int i = 0; i <listOfINT.size() ; i++) {
            if (6 == listOfINT.get(i)) {
                listOfINT.remove(i);
                i--;//if added, removes all values, cause first removal decreases index so it breaks the loop
            }

        }

        // cant use on integer list, it confuses indexes with values
       // listOfINT.remove(1);

        ArrayList listOfThings = new ArrayList();//can put anything in this list,
        listOfThings.add("hello");
        listOfThings.add(3);
        listOfThings.add(true);
        listOfThings.add(listOfINT);//even a whole previous list as an object


        //listOfINT.set(6, 8);//sets value 8 at 6th position

        listOfINT.isEmpty(); //returns true bool if Arraylist is empty

        listOfINT.contains(6);//search for 6

        //Strings

        String myString = "Imaanewsupastringa";
        String supaString = "Imaabadstringa";
        myString.substring(2);
        "hello".substring(1);
        myString.replace( "l","w");
        myString.charAt(5);
        myString.equals("penny");// instead of == in primitive types
        myString.compareTo(supaString);
        myString.endsWith("a");//return bool if string ends with characters
        myString.indexOf("m"); //returns first occurence
        myString.lastIndexOf("lllind");
        myString.split("");//creates an array of string, oddelene tim, co dam do zavorek

        //HASH map
        //dictionary
        //you need to specify BOTH value type AND index type

        HashMap <String, Integer> newHash = new HashMap<>();









    }
}
