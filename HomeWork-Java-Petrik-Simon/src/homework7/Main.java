package homework7;

import java.util.*;

import static homework7.Human.DayOfWeek.*;
import static homework7.Human.countFamily;

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
        // -------Set---------
        Set<String> habitsDog = new HashSet<>();
        habitsDog.add("jump");
        habitsDog.add("GAFF");
        habitsDog.add("jump");
        habitsDog.add("swimming");
        Set<String> habitsFish = new HashSet<>();
        habitsFish.add("eat");
        habitsFish.add("swimming");
        Set<String> habitsDomesticCat = new HashSet<>();
        habitsDomesticCat.add("eat");
        habitsDomesticCat.add("jump");
        habitsDomesticCat.add("sleep");
        Set<String> habitsRoboCat = new HashSet<>();
        habitsRoboCat.add("run");
        habitsRoboCat.add("eat");
        habitsRoboCat.add("jump");




        String[][] scheduleArina = {{wednesday, sunday}, {"Go for a walk", "React consultation"}};

        Human mother = new Human("Olga", "Averina", 25);
        Human father  = new Human("Konstantin", "Averin", 26);
        Human sister = new Human("Arina", "Averina", 18,98);
        Human brother = new Human("Anatoliy", "Averin", 25, 95);
        Human elderSister = new Human("Olya", "Averina", 30, 98);
        Human elderBrother = new Human("Victor", "Averin", 31);
        Human smallSister = new Human("Lena", "Kushnareva", 12);

        //Создайте в классе Main в цикле столько объектов типа Human, чтобы сборщик мусора начал удалять старые объекты
//        int count  = 0 ;
//       for(int i = 0; i < 50000; i++)
//            {
//          Human man = new Human();
//           count++;
//           // вывод в консоль - открыть коммент чтобы сработало
//           System.out.println("man" + count);
//        }
        List<Human> childrensList = new ArrayList<>();
        childrensList.add(0,sister);
        childrensList.add(1,brother);
        childrensList.add(2,elderSister);
        childrensList.add(3,elderBrother);
        childrensList.add(4,smallSister);

        //mother.setSchedule(schedule);
        // father.setSchedule(scheduleFather);
        //  sister.setSchedule(schedule);
        //  brother.setSchedule(scheduleFather);

        //  Family family = new Family(mother, father, childrensList, dog7);
        //   family.setPet(pet);
        //    family.addChildren(brother);
        //  family.deleteChild(0);


        //  pet.eat();
        // pet.respond();
        //pet.foul();
        System.out.println("***");
        //   System.out.println(pet);
        //    System.out.println(getSpeciesNickname.getSpecies() + " " + getSpeciesNickname.getNickname());
        System.out.println("***");
        System.out.println("Количество человек в семье: " + countFamily);
        System.out.println("***");
        System.out.println("Начало HomeWork - 5");
        //  pet.finalize();
        mother.finalize();
        System.out.println("****");
        System.out.println("Homework - 6");
        Dog dog2 = new Dog();
        Fish fish = new Fish();
        RoboCat roboCat = new RoboCat();
        DomesticCat domesticCat = new DomesticCat();
        System.out.println(dog2);
        System.out.println(fish);
        System.out.println(roboCat);
        System.out.println(domesticCat);
        Dog dog3 = new Dog();
        System.out.println(dog3);
        dog3.eat();
        fish.eat();
        roboCat.eat();
        domesticCat.eat();
        dog3.respond();
        fish.respond();
        roboCat.respond();
        domesticCat.respond();
        dog3.foul();
        domesticCat.foul();
        Woman woman = new Woman();
        Man man = new Man();
        woman.greetPet();
        woman.makeup();
        man.greetPet();

        System.out.println("-----------------------------HOMEWORK_7 _----------------------------------");

        Dog dog7 = new Dog("Bobik", 3, 33, habitsDog);
        Fish fish7 = new Fish("Nemo", 1, 3, habitsFish);
        DomesticCat domesticCat7 = new DomesticCat("Linda", 4, 34, habitsDomesticCat);
        RoboCat roboCat7 = new RoboCat("Gloriya", 5, 45, habitsRoboCat);

        System.out.println(dog7);
        System.out.println(fish7);
        System.out.println(domesticCat7);
        System.out.println(roboCat7);

        //*********  Новая семья
        // -----MAP---
        Map <String, String> scheduleFather = new HashMap <String, String >();
        scheduleFather.put("monday", "Java consultation");
        scheduleFather.put("wednesday", "React consultation");
        scheduleFather.put("friday", "JavaScript consultation");

        Map <String, String> scheduleMather = new HashMap <String, String >();
        scheduleMather.put("tuesday", "Sport");
        scheduleMather.put("thursday", "work");
        scheduleMather.put("saturday", "Go for a walk");


       Human matherFamily2 = new Human("Natasha", "Koreneva", 29,98, scheduleMather);
       Human fatherFamily2 = new Human("Vitaliy", "Korenev", 35, 99, scheduleFather);

        System.out.println("matherFamily2 - " + matherFamily2);
        System.out.println("fatherFamily2 - " + fatherFamily2);

        // Новая семья с LIST + MAP + SET
        Family korenevu = new Family(matherFamily2, fatherFamily2, childrensList);
        System.out.println("Korenevu - " + korenevu);












    }

}

