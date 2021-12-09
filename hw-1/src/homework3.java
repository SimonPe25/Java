import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Random randFirst = new Random();
        Random randTwo = new Random();
        int a = 0;
        int b = 4;
        int x  =  a + randFirst.nextInt(b - a + 1);
        int y  =  a + randTwo.nextInt(b - a + 1);
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.println("Hello my friend " + name);
        String[][] field = initField();
        while (true) {
            System.out.println("Let the game begin! Please enter");
            printField(field);
            int numX = in.nextInt();
            int numY = in.nextInt();
            try {
                if (numX > 5 || numX < 1 || numY > 5 || numY < 1) {
                    System.out.println("You must enter a value between 1-5: ");
                } else {
                    field[numX-1][numY-1] ="*";
                    field[x][y] = "?";
                    if (Objects.equals(field[x][y], field[numX-1][numY-1])) {
                        System.out.println(name + " You have won!");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("\n" + "Wrong string format!" + e);
                System.out.println(name + " please, try again only numbers.");
            }
          }
        }
        public static String[][] initField() {
            String[][] field = new String[5][5];
            for (String[] strings : field) {
                Arrays.fill(strings, "-");
            }
            return field;
        }
        public static void printField(String[][] field) {
            System.out.print("0 | ");
            for (int i = 0; i < field.length; i++) {
                System.out.print(i + 1 + " | ");
            }
            System.out.println();
            for (int i = 0; i < field.length; i++) {
                System.out.print(i + 1 + " | ");
                for (int j = 0; j < field[i].length; j++) {
                    System.out.printf("%s | ", field[i][j]);
                }
                System.out.println();
            }
    }
}
