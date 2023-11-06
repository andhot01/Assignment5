import java.util.ArrayList;

public class Test {
    private ArrayList<Person> personList;

    public Test(){
        personList = new ArrayList<>(); //making array list with the 3 persons

        ArrayList<String> subjectsTeacher1 = new ArrayList<>(); //making a.list for each teacher's subjects
        subjectsTeacher1.add("Programming");
        subjectsTeacher1.add("SCO");

        ArrayList<String> subjectsTeacher2 = new ArrayList<>();
        subjectsTeacher2.add("Design");
        subjectsTeacher2.add("SDE");

        PersonManager personManager = new PersonManager();
        Student student = new Student(105, "Bo Ibsen", "bib@easv.dk", "CS");
        student.addGrade("Programming", 12);
        student.addGrade("Design", 7);
        student.addGrade("Math", 10);
        boolean added = personManager.addPerson(student);
        System.out.println(added);

        Teacher teacher1 = new Teacher(202, "Bent H. Pedersen", "bhp@easv.dk", subjectsTeacher1,
                "BHP", 30000.0);
        Teacher teacher2 = new Teacher(203, "Natalie Svendesen", "ns@easv.dk", subjectsTeacher2,
                "NS", 25000.0);
        personManager.addPerson(teacher1);
        personManager.addPerson(teacher2);

        ArrayList<Person> allPersons = personManager.getPersons();
        for (Person person : allPersons){
            System.out.println(person.toString());
        }

        ArrayList<Student> allStudents = personManager.getStudents();
        for (Student studentItem : allStudents){
            System.out.println(studentItem.toString());
        }

        ArrayList<Teacher> allTeachers = personManager.getTeachers();
        for (Teacher teacher : allTeachers){
            System.out.println(teacher.toString());
        }
    }

    public void showPersons(){ //print out the person list by using the toString
        for (Person person : personList){
            System.out.println(person.toString());
        }
    }
}
