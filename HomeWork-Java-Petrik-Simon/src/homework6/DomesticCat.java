package homework6;

import java.util.Arrays;

public class DomesticCat extends Pet implements CanMovies{

    public DomesticCat() {
        super(String.valueOf(Species.DOMESTICCAT));
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(String.valueOf(Species.DOMESTICCAT), nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {

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
                ", habits=" + Arrays.toString(getHabits()) +
                "}";
    }
}
