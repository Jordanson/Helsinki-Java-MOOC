
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        while (true) {
            System.out.println("Type the password:");
            String pwInput = reader.nextLine(); 
            
            if (pwInput.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: fuck off!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
