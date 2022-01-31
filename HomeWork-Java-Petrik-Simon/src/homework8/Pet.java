package homework8;

import java.util.Set;


public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private  Set<String> habits;

    //конструктор, описывающий вид животного и его кличку
    public Pet(String nickname) {
        this.nickname = nickname;
    }
    //конструктор, описывающий все поля животного
    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    //пустой конструктор
    public Pet(){}
    public Pet(String valueOf, String nickname, int age, int trickLevel, Set<String> habits) {
    }


    public void eat(){System.out.println("Я кушаю!");}
    public abstract void respond();
    public void greetPet(){System.out.println("Привет, " + getNickname());}
    public String gettingAnswer(){
        return (getTrickLevel() >= 50) ? " хитрый!" : "не хитрый!";
    }
    public void describePet(){System.out.println("У меня есть " + Species.DOG + ", ему "+ getAge() + " лет, он " + gettingAnswer());}

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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
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
        RABBIT,
        DOMESTICCAT,
        FISH,
        ROBOCAT,
        UNKNOWN
        
    }


    @Override
    public String toString() {
        return "Pet{" +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
}

