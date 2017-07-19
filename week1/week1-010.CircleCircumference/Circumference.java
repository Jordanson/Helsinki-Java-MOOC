
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: "); 
        int input = Integer.parseInt(reader.nextLine());
        
        double Circum = 2 * Math.PI * input;
        
        System.out.println("Circumference of the circle: " + Circum);
        
        
    }
}
