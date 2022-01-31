package homework8;

import java.util.Set;

public class DomesticCat extends Pet implements CanMovies {
 String CAT = String.valueOf(Species.DOMESTICCAT);
    public DomesticCat() {};

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(CAT + " - MYAUUUU");
    }

    @Override
    public void foul() {
        System.out.println(String.valueOf(Species.DOMESTICCAT) + " - Я поцарапал диван");
    }

    @Override
    public String toString() {
        return "DomesticCat{" +
                "species='" +  String.valueOf(Species.DOMESTICCAT) + '\'' +
                ", nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habits=" + getHabits() +
                "}";
    }
}
