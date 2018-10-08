

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public void getGoal(){
        System.out.println("Become a junior developer.");
    }

    public void introduce (){
        System.out.println("Hi, I am " + super.name + ", a " + super.age +" year old " + super.gender +
                " from " + previousOrganization + " who skipped " +skippedDays+ " from that course already");
    }
    public int skipDays (int numberOfDays){
        numberOfDays = numberOfDays + this.skippedDays;
        return numberOfDays;
    }
    public Student (){
        super();
        previousOrganization = "school of life";
        skippedDays = 0;
    }
    public Student ( String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization =previousOrganization;
        this.skippedDays = 0;

    }
}
