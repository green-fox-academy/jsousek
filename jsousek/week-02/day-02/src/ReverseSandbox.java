public class ReverseSandbox {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(reversed));
    }

    public static String reverse(String string) {

        String reversed = "";

        for (int i = string.length()-1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return reversed;
    }
}
