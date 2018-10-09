public class Shifter implements CharSequence {
    String shifS;
    int move;

    public Shifter (String shifS, int move){
        this.shifS = shifS.substring(move);
    }

    @Override
    public int length() {
        return shifS.length();
    }

    @Override
    public char charAt(int move) {
        return charAt(this.move);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Shifter shiftie =new Shifter("wlovklop", 2);

    }
}
