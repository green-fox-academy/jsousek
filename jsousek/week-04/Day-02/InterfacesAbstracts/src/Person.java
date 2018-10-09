import java.util.ArrayList;

public class Person implements Cloneable {
    public String name;
    public int age;
    public String gender;

    public void introduce (){
        System.out.println("Hi, I am "+ name + ", a " + age +" year old " + gender);
    }

    public void getGoal (){
        System.out.println("My goal is: Live for the moment");
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public Person(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }
    public Object clone()  throws CloneNotSupportedException {
        return (Student)super.clone();
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Student john = new Student("John", 20, "male", "BME");

        try {
            Student johnSlightlyMutatedClone = (Student) john.clone();
            johnSlightlyMutatedClone.introduce();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}