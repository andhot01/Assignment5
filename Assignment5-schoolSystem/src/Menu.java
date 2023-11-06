import java.util.Scanner;

/* Abstract class implementing the basic functionality of a console based
menu class. A menu can be created by sub-classing this class and implement
the abstract method doAction(option).

The constructor of the subclass must invoke the super-class constructor by
the instruction
          super(“some header”, “menuoption1", "menuoption2");

Note, that this instruction must be the first instruction of the subclass
constructor.
 @author bhp
*/
public abstract class Menu {
    // value used to exit the menu, can be changed by subclass constructor
    protected int EXIT_OPTION = 0;

    // The menu header text
    private String header;

    // The list of menu options texts.
    private String[] menuItems;

    /*Abstract method stating what should be done when menu is selected.
    has to be overridden by subclass
     */
    protected abstract void doAction(int option);

    public Menu(String header, String[] menuItems) {
        this.header = header;
        this.menuItems = menuItems;
    }

    public void run()
    {
        boolean done = false;
        while (!done)
        {
            showMenu();
            int option = getOption();
            doAction(option);
            if (option == EXIT_OPTION)
            {
                done = true;
            }
        }
    }

    private int getOption() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option < 0 || option > menuItems.length){
            System.out.println("Choose option: ");
            option = scanner.nextInt();
        }
        return option;
    }

    /**
     * Prints out a console menu
     with a header text and a list
     * of menu options. The menu
     options will be assigned the numbers
     * from 1 to the number of
     options in the menu.
     */
    private void showMenu() {
        System.out.println(header);
        for (int i=0; i < menuItems.length; i++){
            System.out.println((i + 1) + " " + menuItems[i]);
        }
        System.out.println("0 Exit");
    }

    /**
     * Waits until the 'enter' key is pressed.
     */
    protected void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter");
        scanner.nextLine();
    }

    //Clears the screen by writing several empty lines.
    protected void clear() {
    }
}

