import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

@SuppressWarnings("unused")
public class homework3 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses;";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to for a walk with a dog";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to the airport";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to the park";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go through passport control";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go fishing";

        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Please, input the day of the week:");
            String wordUser = in.nextLine();
            String adaptiveWord = wordUser.substring(0, 1).toUpperCase() + wordUser.substring(1).trim();
            if (Objects.equals(adaptiveWord, "Exit")) return;
            try {
                for (String[] strings : schedule) {
                    for (int j = 0; j < strings.length; j++) {
                        if (Objects.equals(adaptiveWord, strings[0])) {
                            System.out.println("Your tasks for: " + adaptiveWord + " - " + strings[1]);
                            throw new Exception("");
                        }
                    }
                }
                throw new Exception("Sorry, I don't understand you, please try again.");
                } catch (Exception ex) {
                System.out.println(ex.getMessage());
                }
            }
       }
    }
