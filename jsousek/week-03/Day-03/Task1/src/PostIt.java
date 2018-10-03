import javafx.geometry.Pos;

public class PostIt {
    String backroudcolor;
    String text;
    String textColor;

    public PostIt(String backroudcolor, String text, String textColor){
        this.backroudcolor = backroudcolor;
        this.text = text;
        this.textColor =textColor;

    }

    public PostIt(){

    }

    public static void main(String[] args) {
        PostIt first = new PostIt("orange", "Idea1", "Blue");
        PostIt second = new PostIt("pink", "Awesome", "black");
        PostIt third = new PostIt("yellow", "superb", "green");
        PostIt voidPostIt = new PostIt();

    }
}


