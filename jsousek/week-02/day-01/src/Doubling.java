public class Doubling {
     static int baseNum =123;
    public static void main(String[] args) {
        //calls a function (in psvm)
        doubling();

// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

    }
    //state a function (same level as psvm)
    public static void doubling (){
        baseNum *= 2;
        System.out.println(baseNum);}

}