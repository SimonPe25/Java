import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = 0;
        int b = 100;
        int x  =  a +  rand.nextInt(b - a + 1);
        int numDefault = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        while (true)
        {
            System.out.println("Let the game begin! Please enter");


            try {
                int num = in.nextInt();
                if (num > x || num < x) {
                    if (num > x) {
                        System.out.println("Your number is too big. Please, try again.");
                        System.out.println(name);
                    }
                    if (num < x) {
                        System.out.println("Your number is too small. Please, try again.");
                    }
                } else {
                    System.out.printf("Congratulations, %s \n", name);

                    break;
                }

            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат строки!");
            }
        }
    }
};

