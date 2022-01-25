package homework5;

import java.util.ArrayList;
import java.util.Locale;

import static homework5.Human.countFamily;
import static homework5.Human.DayOfWeek.*;

public class Main {
    public static void main(String[] args) {
        Pet.Species dog = Pet.Species.DOG;
        String sunday = SUNDAY.name();
        String monday = MONDAY.name();
        String tuesday = TUESDAY.name();
        String wednesday = WEDNESDAY.name();
        String thursday = THURSDAY.name();
        String friday = FRIDAY.name().toLowerCase(Locale.ROOT);
        String saturday = SATURDAY.name();




        Pet pet = new Pet(dog, "Charley", 8, 30, new String[]{"run", "jump", "eat"});
        Pet getSpeciesNickname = new Pet(dog, "Charley");
        String[][] schedule = {{monday, wednesday, friday}, {"Java consultation", "React consultation", "JavaScript consultation"}};
        String[][] scheduleFather = {{tuesday, thursday, saturday}, {"Sport", "work", "Go for a walk"}};
        String[][] scheduleArina = {{wednesday, sunday}, {"Go for a walk", "React consultation"}};

        Human mother = new Human("Olga", "Averina", 25);
        Human father  = new Human("Konstantin", "Averin", 26);
        Human sister = new Human("Arina", "Averina", 18,98);
        Human brother = new Human("Anatoliy", "Averin", 25, 95);
        Human elderSister = new Human("Olya", "Averina", 30, 98);
        Human elderBrother = new Human("Victor", "Averin", 31);
        Human smallSister = new Human("Lena", "Kushnareva", 12);

        //Создайте в классе Main в цикле столько объектов типа Human, чтобы сборщик мусора начал удалять старые объекты
        int count  = 0 ;
       for(int i = 0; i < 50000; i++)
            {
          Human man = new Human();
           count++;
           // вывод в консоль - открыть коммент чтобы сработало
           System.out.println("man" + count);
        }



        mother.setSchedule(schedule);
        father.setSchedule(scheduleFather);
        sister.setSchedule(schedule);
        brother.setSchedule(scheduleFather);

        Family family = new Family(mother, father, new Human[]{sister});
        family.setPet(pet);
        family.addChildren(brother);
        family.deleteChild(0);


        System.out.println("***");
        System.out.println("new Famaly " +  family);
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println("***");
        System.out.println(pet);
        System.out.println(getSpeciesNickname.getSpecies() + " " + getSpeciesNickname.getNickname());
        System.out.println("***");
        System.out.println("Количество человек в семье: " + countFamily);
        System.out.println("***");
        System.out.println("Начало HomeWork - 5");
        pet.finalize();
        mother.finalize();
        family.finalize();
    }

}
