package homework11;

public class Factorial {
    public static int getFactorial(int num) throws FamilyOverflowException{

        int result=1;
        if(num>5) throw new FamilyOverflowException("ОШИБКА Количество Людей должно быть не больше 6", num);

        for(int i=6; i<=num;i++){
            result*=i;
        }
        return result;
    }
}
