package homework7;

import java.util.Arrays;
import java.util.Set;

public class Fish extends Pet {


    public Fish() {};

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super( nickname, age, trickLevel, habits);
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
                ", habits=" + getHabits() +
                "}";
    }
}
