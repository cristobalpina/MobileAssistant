import java.util.Random;
import java.util.Scanner;


public class GuessStarter {
 
    public static void printIntro(){
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
    }
    public static int generateRandomInt(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    public static void guess(int x){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number:");
        int i = sc.nextInt();
        System.out.println("Your guess is: " + i);
        int diff = x - i;
        if(diff == 0){
            System.out.println("Correct, the number was: " + x);
        }
        else if (diff > 0) {
            System.out.println("Too low");
            guess(x);
        }
        else {
            System.out.println("Too high");
            guess(x);
        }
        
        
    }

    
    public static void main(String[] args) {
        printIntro();
        int number = generateRandomInt();
        guess(number);
        
    }
}


