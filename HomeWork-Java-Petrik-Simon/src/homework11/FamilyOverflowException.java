package homework11;

public class  FamilyOverflowException extends RuntimeException {

    private int number;

    public int getNumber() {
        return number;
    }

    public FamilyOverflowException(String message, int num) {
        super(message);
        number = num;
    }
}
