import java.util.ArrayList;
import java.util.Objects;

public class Cohort {
    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public ArrayList addStudent (Student anyStudent){
        students.add(anyStudent);
        return students;
    }
    public ArrayList addMentor (Mentor anyMentor){
        mentors.add(anyMentor);
        return mentors;
    }
    public void info (){
        System.out.println("The cohort has " + this.students.size() +" students, and "+this.mentors.size() +" mentors");
    }
    public Cohort (String name, ArrayList<Student> students, ArrayList<Mentor> mentors){
        this.name = name;
        this.students = students;
        this.mentors = mentors;

    }

}
