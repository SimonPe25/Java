import java.util.Arrays;

public class homework2 {
    public static void main(String args[]) {

        int i3 = 0;
        String str2 = "fff";
        try {
            i3 = Integer.parseInt(str2);
            System.out.println(i3);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
