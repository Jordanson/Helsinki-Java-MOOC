
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int first = Integer.parseInt(reader.nextLine());   
        
        System.out.println("Type another number");
        int second = Integer.parseInt(reader.nextLine());
        
        double quotient = (double)first/second; 
        System.out.println("Division: " + first + " / " + second + " = " + quotient);
        // Implement your program here. Remember to ask the input from user.
    }
}
