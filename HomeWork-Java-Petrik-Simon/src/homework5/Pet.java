package homework5;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private  String[] habits;



    //конструктор, описывающий вид животного и его кличку
    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
    //конструктор, описывающий все поля животного
    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this (species, nickname);
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    //пустой конструктор
    public Pet(){}

    public void eat(){System.out.println("Я кушаю!");}
    public void respond(){System.out.println("Привет хозяин. Я - " + nickname + ". Я соскучился!");}
    public void foul(){System.out.println("Нужно хорошо замести следы...)");}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && species.equals(pet.species) && nickname.equals(pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel);
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 30){
            throw new RuntimeException("Invalid age");
        }
        this.age = age;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    @Override
    protected void finalize() {
        System.out.println("Удаляемый объектв классе Pet в методе finalize(): " + this);
    }

    enum Species {
        DOG,
        CAT,
        SHARK,
        RABBIT
    }

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' + ", age=" + age + ", trickLevel='" + trickLevel + '\'' + ", habits=" + Arrays.toString(habits) + '}';

    }
}

