package homework12;

import java.util.Set;

public class RoboCat extends Pet {
  String ROBOCAT = String.valueOf(Species.ROBOCAT);

    public RoboCat() {};

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super( nickname, age, trickLevel, habits);
    }
    @Override
    public void respond() {
        System.out.println(ROBOCAT + " - M-Y-A-UUU--UU");
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
                ", habits=" + getHabits() +
                "}";
    }
}
