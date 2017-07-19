
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: "); 
        int input = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int input2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("The biggest number of the two numbers given was: " + Math.max(input, input2));
    }
}
