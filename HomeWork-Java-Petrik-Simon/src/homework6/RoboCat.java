package homework6;

import java.util.Arrays;

public class RoboCat extends Pet {


    public RoboCat() {
        super(String.valueOf(Species.ROBOCAT));
    }

    public RoboCat( String nickname, int age, int trickLevel, String[] habits) {
        super(String.valueOf(Species.ROBOCAT), nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {

    }

    @Override
    public void eat() {
        System.out.println(String.valueOf(Species.ROBOCAT) + " - Я кушаю конденсаторы!");
    }

    @Override
    public String toString() {
        return "RoboCat{" +
                "species='" +  String.valueOf(Species.ROBOCAT) + '\'' +
                ", nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habits=" + Arrays.toString(getHabits()) +
                "}";
    }
}
