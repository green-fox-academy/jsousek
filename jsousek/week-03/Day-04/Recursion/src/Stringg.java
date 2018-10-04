public class Stringg {
    public static void main(String[] args) {
        System.out.println(stringConverter("xoxo"));

    }

    public  static String stringConverter (String inputS){
        if (inputS.length() ==0){
            return inputS;}

         String temp = inputS.substring(0,1).equals("x") ? "": inputS.substring(0,1);

        return temp +stringConverter(inputS.substring(1));


    }
}
