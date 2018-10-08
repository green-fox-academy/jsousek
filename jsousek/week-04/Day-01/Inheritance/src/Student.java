

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public void getGoal(){
        System.out.println("Become a junior developer.");
    }

    public void introduce (){
        System.out.println("Hi, I am " + name + ", a " + age +" year old " + gender +
                "from" + previousOrganization + "who skipped" +skippedDays+ "from that course already");
    }
    public int numberOfDays (int numberOfDays){
        numberOfDays = numberOfDays + this.skippedDays;
        return numberOfDays;
    }
    public Student (){
        super();
        previousOrganization = "school of life";
        skippedDays = 0;
    }
    public Student (String name, int age, String gender, String previousOrganization, int skippedDays){
        super(name, age, gender);

    }
}
