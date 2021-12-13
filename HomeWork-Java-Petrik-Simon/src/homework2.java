import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class homework2 {
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
        String[][] canvas = initCanvas();
        while (true) {
            System.out.println("Let the game begin! Please enter");
            showCanvas(canvas);
            String numXGet = in.nextLine();
            String numYGet = in.nextLine();
            try {
                int numX = Integer.parseInt(numXGet);
                int numY = Integer.parseInt(numYGet);
                if (numX > 5 || numX < 1 || numY > 5 || numY < 1) {
                    System.out.println("You must enter a value between 1-5: ");
                } else {
                    canvas[numX-1][numY-1] ="*";
                    canvas[x][y] = "?";
                    if (Objects.equals(canvas[x][y], canvas[numX-1][numY-1])) {
                        System.out.println(name + " You have won!");
                        canvas[x][y] = "Х";
                        showCanvas(canvas);
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("\n" + "Wrong string format!" + e);
                System.out.println(name + " please, try again only numbers.");
            }
        }
    }
    public static String[][] initCanvas() {
        String[][] canvas = new String[5][5];
        for (String[] strings : canvas) {
            Arrays.fill(strings, "-");
        }
        return canvas;
    }
    public static void showCanvas(String[][] canvas) {
        System.out.print("0 | ");
        for (int i = 0; i < canvas.length; i++) {
            System.out.print(i + 1 + " | ");
        }
        System.out.println();
        for (int i = 0; i < canvas.length; i++) {
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.printf("%s | ", canvas[i][j]);
            }
            System.out.println();
        }
    }
}