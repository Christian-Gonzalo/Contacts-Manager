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
