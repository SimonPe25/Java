package homework4;

import java.util.Arrays;
import java.util.Objects;
    //конструктор, описывающий все поля
    public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule = new String[2][2];


        static int countFamily  = 0 ;
    //конструктор, описывающий имя, фамилию и год рождения
    public Human(String name, String surname, int year) {
        countFamily++;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq) {
        this(name, surname, year);
        this.iq = iq;

    }
    //пустой конструктор
    public Human() {}



    public void greetPet(){System.out.println("Привет, " + family.getPet().getNickname());}
    public String gettingAnswer(){
        return (family.getPet().getTrickLevel() >= 50) ? " хитрый!" : "не хитрый!";
     }

    public void describePet(){System.out.println("У меня есть " + family.getPet().getSpecies() + ", ему "+ getYear() + " лет, он " + gettingAnswer());}

    public String getName() {
        return name;
    }

    public String getMatherName() {
        return family.getMother().getName() + "Мама";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }



    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule= " + Arrays.deepToString(schedule) +
//                ", mother=" + (mother != null ? mother.getName() + " " + mother.getSurname() : "") +
//                ", father=" + (father != null ? father.getName() + " " + father.getSurname() : "") +
//                ", pet=" + pet +
                '}';
    }





}
