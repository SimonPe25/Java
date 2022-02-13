package homework12;


import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Map;

    //конструктор, описывающий все поля

public class Human implements Serializable {
    private String name;
    private String surname;
   // private int year;
    private int iq;
    private Family family;
    private Map <String, String> schedule;
    public static int countHuman  = 0 ;
    private int people = 0;
    private Long birthDate;
    private String gender;

    public Long getBirthDate() {
        return birthDate;
    }

    public int getYearHuman(Long time) {
       LocalDate toDay = LocalDate.now();
       LocalDate birthDate = new Timestamp(time).toLocalDateTime().toLocalDate();
        return Period.between(birthDate, toDay).getYears();
    }
    public long getUnixTime (String dateString) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(dateString );
        long unixTime = (long) date.getTime();
        return unixTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPeople() {
        return people++;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, String birthDate, int iq, Map <String, String> schedule) throws ParseException {
        getPeople();
        countHuman++;
        this.name = name;
        this.surname = surname;
        this.birthDate = getUnixTime(birthDate);
        this.iq = iq;
        this.schedule = schedule;
    }


    public Human(String gender, String name, String surname, String birthDate, int iq) throws ParseException {
        this.gender=gender;
        this.name = name;
        this.surname = surname;
        this.birthDate = getUnixTime(birthDate);
        this.iq = iq;

    }
       public Human( String name, String surname, String birthDate, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = getUnixTime(birthDate);
        this.iq = iq;

    }

    //конструктор, описывающий имя, фамилию и год рождения
    public Human(String name, String surname, String birthDate) throws ParseException {
        countHuman++;
        this.name = name;
        this.surname = surname;
        this.birthDate = getUnixTime(birthDate);
    }

    //пустой конструктор
    public Human() {}
    public Human( String name) {
        this.name=name;
    }

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
                ", year=" + (birthDate !=null ? getYearHuman(birthDate) : "") +
                ", iq=" + iq +
                ", schedule= " + schedule +
//                ", mother=" + (mother != null ? mother.getName() + " " + mother.getSurname() : "") +
//                ", father=" + (father != null ? father.getName() + " " + father.getSurname() : "") +
//                ", pet=" + pet +
                '}';
    }





}
