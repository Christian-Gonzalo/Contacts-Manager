public class Input {
    private final Scanner scanner;
}
//** this is the scanner for input the menu.
public Input () {
    this.scanner = Scanner(System.in);
}
public String get(){
    return this.scanner.nextLine();
}
public boolean yesNO(){
    System.out.println(("Yes(y) or No(n)"));
    String input = getString().trim().toLowerCase();
    char checkValue = input.charAt(0);
    return checkValue == "y";
}
public int getInt(int min, int max){
    int input;
    boolean exceptionFound;
    boolean outOfBounds = false;
    do {
        exceptionFound = false;
        System.out.println("Hello. Enter a number between " + min + " and " + max + ": ");
        outOfBounds = true;
    } else {
        // user entered a correct integer
        outOfBounds = false;
    } catch ( Exception e) {
        System.out.println("Hey, this is not an integer");
        System.out.println();
        exceptionFound = true;
    }
    } while (exceptionFound || outOfBounds);
            return input;
        }