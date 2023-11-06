import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> persons = new ArrayList<>();

    public boolean addPerson(Person person){
        if (!persons.contains(person)){
            persons.add(person);
            return true;
        }
        return false;
    }

    public boolean removePerson(Person person){
        return persons.remove(person);
    }

    public Person findPersonById(int id){
        for (Person person : persons){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public ArrayList<Person> getPersons(){
        return new ArrayList<>(persons);
    }

    public ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        for (Person person : persons){
            if (person instanceof Student){
                students.add((Student) person);
            }
        }
        return students;
    }

    public ArrayList<Teacher> getTeachers(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person person : persons){
            if (person instanceof Teacher){
                teachers.add((Teacher) person);
            }
        }
        return teachers;
    }
}
