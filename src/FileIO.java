public class FileIO {
    public static Path dataFile = Paths.get("data", "contacts.txt");
    private static boolean gotMatch;
    private string name;

    public static void viewContacts(){
        Input entry = new Input();
       if (File.notExists)(this.logFilePath)
        try {
            File.createContact(this.logFilePath);

        } catch (Exception e) {
            System.out.println("Contact not found!");
        }

    }
    public static void addContact(){
        Input entry = new Input();
        System.out.println("Enter your new contact's name: ");
        System.out.println("Enter your new contact's phone number: ")
    }
    public static void searchContacts(){
        Input entry = new Input();
        System.out.println("Enter the name you're looking for: ");
    }
    public static void deleteContact(){
        Input entry = new Input();
        System.out.println("Enter the contact you want to delete: ");
    }

}
