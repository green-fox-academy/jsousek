public class StringAdjacent {
    public static void main(String[] args) {
       String newS ="hellostring";
        System.out.println(addStar(newS));
        addStar(newS);

    }
    public static String addStar (String origString){
        String star ="*";
        if (origString.length() == 1){
            return "k";
        }
        else {
            return  origString.charAt(0) + star + addStar(origString.substring(1));
        }
    }
}

