public class Gnirts implements CharSequence{
    String gnString;




    public Gnirts (String gnString){
        this.gnString = gnString;


    }






    @Override
    public int length() {
        return gnString.length();
    }

    @Override
    public char charAt(int index) {
        return gnString.charAt(length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String anyStr = "";
        for(int i =  start; i == end; i++)
        {
          anyStr += gnString.charAt(length()-1-i);
        }
        return anyStr;
    }

    public static void main(String[] args) {
        Gnirts gn1 = new Gnirts("wololo");
        System.out.println(gn1.charAt(5));
    }
}
