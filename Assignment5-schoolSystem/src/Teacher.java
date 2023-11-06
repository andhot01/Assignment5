import java.util.ArrayList;

public class Teacher extends Person{
    //create the attributes each teacher has
    private ArrayList<String> subjects;
    private String initials;
    private double salary;

    public Teacher(int id, String name, String email, ArrayList<String> subjects, String initials,
                   double salary) {
        //not sure if it was a mistake on moodle, but I couldn't make it work without the email String
        super(id, name, email);
        this.subjects = subjects;
        this.initials = initials;
        this.salary = salary;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + " " + initials + " " + subjects.get(0);
        //get(0) reads the first element of a.list
    }
}
