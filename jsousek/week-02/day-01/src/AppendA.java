public class AppendA {

    //almost all of this is pure copycat...looks like it always needs a method

    public static void main(String[] args) {

        String [] animals = {"koal", "pand", "zebr"};

        for ( String animal:animals) {
            animal=Append(animal);

            System.out.println(animal);

        }

        }



    public static String Append (String appendix){

        return appendix+"a";

    }
    // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
}
