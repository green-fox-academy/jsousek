public class Sponsor extends Person{
    String company;
    int hiredStudents;

    public void introduce(){
        System.out.println("Hi, I am "+ super.name + ", a " + super.age +" year old " + super.gender +
                " from company "+ this.company +" and hired " +this.hiredStudents + " so far.");
    }
    public void getGoal (){
        System.out.println("Hire the best junior devs.");
    }
    public int hire (){
        return this.hiredStudents++;
    }
    public Sponsor(String name, int age, String gender, String company, int hiredStudents){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }
    public Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents =0;
    }
}
