public class Counter {
    public static void main(String[] args) {


        System.out.println(countFnc(5));

    }

    public static int countFnc (int a){
        int stopInFnc = 0;
        if (a == stopInFnc){
            return stopInFnc;
        }
        else {
            return countFnc(a-1) ;
        }
    }

}
