import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ContactManager {
    public static void main(String[] args){
        displayUi();
    }

    public static void displayUi(){
        System.out.println("Welcome to your Hobbit Manager:");
        System.out.println("1. View Hobbits.");
        System.out.println("2. Add a new Hobbit.");
        System.out.println("3. Search a Hobbit by name.");
        System.out.println("4. Delete an existing Hobbit.");
        System.out.println("5. Exit.");
        space();
        usersChoice();
    }

    public static void usersChoice(){
        Input selection = new Input();
        int choice = selection.getInt("Enter an option (1, 2, 3, 4 or 5): ");
        switch (choice){
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
                FileIO.deleteContact();
                break;
            case 5:
                System.out.println("Safe travels on your quest!");
                break;

            default:
                System.out.println("Looks like you've made an invalid selection. Try again.");
                usersChoice();
        }
    }

    public static void continueChoosing(){
        space();
        System.out.print("Would you like to make another selection? ");
        Input choice = new Input();
        if(choice.yesNo()){
            space();
            displayUi();
        }else {
            System.out.println("Safe travels on your quest!");
            System.exit(0);
        }
    }


    public static void space(){
        System.out.println();
    }


}
