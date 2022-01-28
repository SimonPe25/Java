package homework6;

import java.util.Arrays;
import java.util.logging.SocketHandler;

public class Dog extends Pet implements CanMovies {

    public Dog() {
        super(String.valueOf(Species.DOG));
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(String.valueOf(Species.DOG), nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {

    }

    @Override
    public void eat() {
        System.out.println(String.valueOf(Species.DOG) + " - Я кушаю косточки!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" +  String.valueOf(Species.DOG) + '\'' +
                ", nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habits=" + Arrays.toString(getHabits()) +
                "}";
    }

    @Override
    public void foul() {
        System.out.println( String.valueOf(Species.DOG) + " - Хозяин я сгрыз твою палку");
    }
}
