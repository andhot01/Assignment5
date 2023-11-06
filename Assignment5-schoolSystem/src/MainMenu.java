public class MainMenu extends Menu{


    public MainMenu(){
        super("Main menu", new String[]{"Option 1", "Option 2", "Option 3"});
    }

    @Override
    protected void doAction(int option) {
        switch (option){
            case 1:
                System.out.println("Option 1 was selected");
                break;

            case 2:
                System.out.println("Option 2 was selected");
                break;

            case 3:
                System.out.println("Option 3 was selected");
                break;
        }
        pause();
    }
}
