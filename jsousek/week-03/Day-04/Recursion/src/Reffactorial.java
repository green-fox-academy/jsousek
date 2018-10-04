public class Reffactorial {
    public static void main(String[] args) {

        System.out.println(factorialOfN(5));

    }
    public static int factorialOfN (int inputInt){
        if (inputInt <= 0){
            return 0;
        }
        else if (inputInt == 1) {
            return 1;
        }
        else return inputInt*factorialOfN(inputInt-1);
    }
}
