import java.util.Random;
import java.util.Scanner;


public class GuessStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number:");
        int i = sc.nextInt();
        System.out.println("Your guess is: " + i);
        System.out.println("You were off by: "  + Math.abs(number - i));
    }
}
