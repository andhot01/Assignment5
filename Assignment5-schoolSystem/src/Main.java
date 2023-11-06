public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();

        mainMenu.run();

    }
}
/*Exercise 1: didn't understand why the get and set methods were needed, otherwise fine
Ex.2: "How are the teachers printed?" The teachers are printed with the extra information.
Ex.3: "How are the students printed?" The student is printed with the normal person information and their
education and average grade (with many decimals).
Ex.4: Used chatGPT understand most of it.
Ex.5: The program is not working after changing Person class to abstract, because the Test class is making 3
persons, which isn't possible since Person class can't make objects.
After deleting the 3 Person objects, the program works as it should and prints out the person list, the student
list and the teacher list (which is why all names show up twice).
Ex.6: Took a while to get the things in the menu done.
Ex.7: No problems.
Ex.8: Incomplete, didn't have time to finish.
 */