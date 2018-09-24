public class Greet {
    static String al ="Greenfox";
    static String el ="BlackGoose";
    public static void main(String[] args) {
        greet(el);

    }
    public static void greet(String name){
        System.out.println( "Greeting, dear "+name);
    }
}

//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`