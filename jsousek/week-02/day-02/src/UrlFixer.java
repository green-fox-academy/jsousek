

public class UrlFixer {



    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String fixUrlEnd ="odds";


        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url);

        url = url.replace("s/", "s:/");
        System.out.println(url);


        url = url.substring(0,url.length() -fixUrlEnd.length());
        url = url + fixUrlEnd;
        System.out.println(url);

        stringParser(url);
        System.out.println(url);

    }
    public static String stringParser (String s){
        return s.substring(0, s.length() -4) +"odds" ;

    }
}