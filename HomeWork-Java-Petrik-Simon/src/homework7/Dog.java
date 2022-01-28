package homework6;


import java.util.Arrays;

public class Dog extends Pet implements CanMovies {
    String DOG = String.valueOf(Species.DOG);
    public Dog(){};

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(String.valueOf(Species.DOG), nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(DOG + " - GAFF");
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
