import java.util.ArrayList;

public class Person {
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

    public static void main(String[] args) {
        Person johny = new Person();
        Student marry = new Student("marr", 18, "male", "vsz", 1);


    }
}
