import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 0;
        int b = 100;
        int x  =  a +  rand.nextInt(b - a + 1);
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.println("Let the game begin! Please enter");
        while (true)
        {
            String numberUser = in.nextLine();
            try {
               num = Integer.parseInt(numberUser);
                if( num < a || num > b) {
                    System.out.print("You must enter a value between 1-100: ");
                }
                if (num > x || num < x) {
                    if (num > x) {
                        System.out.println("Your number is too big. Please, try again.");
                    }
                    if (num < x) {
                        System.out.println("Your number is too small. Please, try again.");
                    }
                } else {
                    System.out.printf("Congratulations, %s \n", name);
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("\n" + "Wrong string format!");
                System.out.println(name + " please, try again only numbers.");
            }
        }
    }
};

