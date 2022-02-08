package homework9;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

    //конструктор, описывающий все поля

public class Human<oneYear> {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    private String surname;
    private int year;
    private int iq;
    private Family family;
    private Map <String, String> schedule;
    public static int countHuman  = 0 ;
    private int people = 0;
    private String birthDateAdoptedChild;

    private long oneYear = 31556952L;
    public void describeAge(){
        calculateTime(getYearInMilisec());
    }
    public static void calculateTime(long seconds) {
        long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        long days = seconds / 86400;
        System.out.println("Day " + days + " Hour " + hours + " Minute " + minutes + " Seconds " + sec);
    }


    public int getPeople() {
        return people++;
    }

    public Human(String name, String surname, int year, int iq, Map <String, String> schedule) {
        getPeople();
        countHuman++;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, String birthDateAdoptedChild, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDateAdoptedChild = birthDateAdoptedChild;
        this.iq = iq;
    }

    public String getBirthDateAdoptedChild() {
        return birthDateAdoptedChild;
    }

    public void setBirthDateAdoptedChild(String birthDateAdoptedChild) {
        this.birthDateAdoptedChild = birthDateAdoptedChild;
    }

    //конструктор, описывающий имя, фамилию и год рождения
    public Human(String name, String surname, int year) {
        countHuman++;
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

    public long getYear() {
        return year;
    }
    public long getYearInMilisec(){
        return year * oneYear;
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

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

        public static int getCountFamily() {
            return countHuman;
        }
        static int deleteCount = 0;

        @Override
        protected void finalize() {
            deleteCount++;
            System.out.println("Удаляемый объектв классе Human в методе finalize(): " + this + " " + deleteCount + " - раз");
        }
        enum DayOfWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
        @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + (birthDateAdoptedChild !=null ? birthDateAdoptedChild : year) +
                ", iq=" + iq +
                ", schedule= " + schedule +
//                ", mother=" + (mother != null ? mother.getName() + " " + mother.getSurname() : "") +
//                ", father=" + (father != null ? father.getName() + " " + father.getSurname() : "") +
//                ", pet=" + pet +
                '}';
    }





}
