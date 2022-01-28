package homework6;

import java.util.Arrays;

public class Fish extends Pet {


    public Fish() {};

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(String.valueOf(Species.FISH), nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {

    }

    @Override
    public void eat() {
        System.out.println(String.valueOf(Species.FISH) + " - Я кушаю ракушки!");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "species='" +  String.valueOf(Species.FISH) + '\'' +
                ", nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habits=" + Arrays.toString(getHabits()) +
                "}";
    }
}
