public abstract class Person {
    //create the attributes every person has
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //the get methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    //the set methods
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    //overwriting the toString
    public String toString(){
        return id + " " + name + " " + email;
    }

    public boolean equals(Object object){//chatgpt helped, but I understand the steps and why
        if (this == object){
            return true;
        }
        if (object == null || getClass() != object.getClass()){
            return false;
        }
        Person person = (Person) object;
        return id == person.id;
    }
}
