public class Stringg {
    public static void main(String[] args) {
        System.out.println(stringConverter("xoxo", 'x'));

    }

    public  static String stringConverter (String inputS, char letter){
        int index =inputS.indexOf(letter);
        if (inputS.length() ==0){
            return inputS;}

        // String temp = inputS.substring(0,1).equals("x") ? "": inputS.substring(0,1);

       // return temp +stringConverter(inputS.substring(1));

        else {
            return stringConverter(inputS.substring(0,index)+inputS.substring(index+1),inputS;
        }


    }
}
