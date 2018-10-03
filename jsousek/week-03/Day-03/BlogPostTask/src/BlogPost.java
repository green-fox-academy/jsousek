public class BlogPost {
    String authorName;
    String tittle;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String tittle, String text, String publicationDate){
        this.authorName = authorName;
        this.tittle = tittle;
        this.text = text;
        this.publicationDate =publicationDate;

    }

    public BlogPost() {

    }

    public static void main(String[] args) {
        BlogPost lorem = new BlogPost("John Doe", "Lorem Ipsum","Lorem ipsum "
                +"dolor sit amet","2000.05.04" );
        BlogPost lastPost = new BlogPost();
          lastPost.authorName = "William Turton";
          lastPost.publicationDate = "2017.03.28.";
          lastPost.tittle = "One Engineer Is Trying to Get IBM to Reckon With Trump";
          lastPost.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. \n " +
                  "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";


    }

}

