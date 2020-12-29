import java.util.ArrayList;
import java.io.IOException;

public class Manager {
    public static void main(String[] args) {
        ArrayList<String>contacts = new ArrayList<>();

//        contacts.add(newContact, newNumber);
    }

    public static void menu(){
        System.out.println("1 View contacts.");
        System.out.println("2 Add a new contact.");
        System.out.println("3 Search a contact by name.");
        System.out.println("4 Delete an existing contact.");
        System.out.println("5 Exit");


    }

    public static void usersChoice(){
        input selection = new input();
        System.out.println("Enter an option (1, 2, 3, 4, or 5):");

        switch(userChoice) {
            case 1:
                FileIO.viewContacts();
                break;
            case 2:
                FileIO.addContact();
                break;
            case 3:
                FileIO.searchContacts();
                break;
            case 4:
                fileIO.deleteContacts();
                break;
            case 5:
                System.out.println("Adios!");
                break;
            default:
                System.out.println("Sorry, you've made a wrong selection");
                usersChoice();
        }
    }
    public static void continueChoosing (){
        space();
        System.out.println("Would you like to make another selection?");
        Input choice = new Input();
        if(choice.yesNo()){
            space();
            diplayUi();
        } else{
            System.out.println("Have a great day!");
            System.exit(0);
        }
    }
    public static void space(){
        System.out.println();
    }
}
