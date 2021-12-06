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
        //int[][] arrUser = {{x},{y}};
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.println("Hello my friend " + name);
        String[][] field = initField();
        while (true) {
            System.out.println("Let the game begin! Please enter");
            printField(field);
            System.out.println(name + ", this number is a line of matrix");
            int numX = in.nextInt();
            System.out.println(name + ", this number is a column of matrix");
            int numY = in.nextInt();
            field[numX][numY] ="*";
            field[x][y] = "?";

            if (Objects.equals(field[x][y], field[numX][numY])) {
                System.out.println(name + " You have won!");
                break;
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
