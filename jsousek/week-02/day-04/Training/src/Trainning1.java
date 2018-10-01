import java.math.BigDecimal;

public class Trainning1 {
    public static void main(String[] args) {
        double newdouble = 25.65;
        System.out.println((int) newdouble);
        double nextD = 15.3258D;

        String value =Double.toString(nextD);
        BigDecimal bigV =new BigDecimal(value);

        BigDecimal bsum =bigV.add(bigV).add(bigV);
        System.out.println(bsum);

        double longDouble =3.999D;
        System.out.println((int)longDouble);

    }


}
