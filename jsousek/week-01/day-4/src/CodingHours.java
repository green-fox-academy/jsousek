import java.sql.SQLOutput;

public class CodingHours {
    public static void main(String[] args) {
       // System.out.println(Math);
        int dayHours= 6;
        int allWeeks = 17;
        int allDays = allWeeks*5;
        double weeklyWorkh = 52;
        double allWorkh = weeklyWorkh*allWeeks;
        double codeWorkh = allDays*dayHours;
        System.out.println(codeWorkh);


        System.out.println("hours in semester "+allDays * dayHours);
        //System.out.println("percentage of coding hours "+ (Math.floor(allWorkh, codeWorkh)*100+" %");
        //no workie workie...
        System.out.println("percentage of coding hours "+ (codeWorkh/ allWorkh)*100+" %");
        ;

        //solution above is in :"Excel lady" style


        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}