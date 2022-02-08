package homework9;

import homework9.controller.FamilyController;
import homework9.dao.CollectionFamily;
import homework9.service.FamilyService;

import java.text.ParseException;
import java.util.*;

import static homework9.Human.DayOfWeek.*;
import static homework9.Human.countHuman;


public class Main {
    public static void main(String[] args) throws ParseException {
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

        List<Human> childrenEgorov = new ArrayList<>();
        childrenEgorov.add(sister);
        childrenEgorov.add(elderBrother);
        List<Human> childrenPopov = new ArrayList<>();
        childrenPopov.add(sister);




        System.out.println("***");
        System.out.println("Количество человек в семье: " + countHuman);
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
        woman.makeup();


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

        //SEt PET
        Set<String> petGroup = new HashSet<>();
        Pet tuzik = new Dog("Tuzik", 10, 45,habitsDog);
        Pet nemo = new Fish("Nemo", 1, 58, habitsFish);
        Pet barsik = new RoboCat("Barsik", 5, 68,habitsRoboCat);
        Pet pushok = new DomesticCat("Pushok", 6, 87, habitsDomesticCat);

        tuzik.greetPet();
        tuzik.respond();

        petGroup.add(String.valueOf(tuzik));
        petGroup.add(String.valueOf(nemo));
        petGroup.add(String.valueOf(barsik));
        petGroup.add(String.valueOf(pushok));


        // Новая семья с LIST + MAP + SET
        Family pushkarev = new Family(matherFamily2, fatherFamily2, childrensList, petGroup);
        Family ivanov = new Family(matherFamily2, fatherFamily2, childrensList, petGroup);
        Family egorov = new Family(matherFamily2, fatherFamily2,childrenEgorov);
        Family popov = new Family(mother, father, childrenPopov);


        System.out.println(petGroup);
        System.out.println(pushkarev);

        List<Family> allFamaly = new ArrayList<>();
       allFamaly.add(pushkarev);
        allFamaly.add(ivanov);
        allFamaly.add(egorov);
        allFamaly.add(popov);


        CollectionFamily collectionFamily = new CollectionFamily(allFamaly);
        FamilyService familyService = new FamilyService(collectionFamily);

        FamilyController familyController = new FamilyController(familyService);
        System.out.println("---------------");

        familyController.getFamiliesBiggerThan(allFamaly, 4);
        System.out.println("Меньше----------------");
        familyController.getFamiliesLessThan(allFamaly, 10);
        familyController.countFamiliesWithMemberNumber(allFamaly, 7);
        familyController.createNewFamily(mother, null);
        familyController.createNewFamily(brother,sister);
        familyController.createNewFamily(sister, null);
        familyController.displayAllFamilies();
        familyController.deleteFamilyByIndex(4);
        familyController.displayAllFamilies();
        familyController.bornChild(popov, "PETROVICH", "KAROLINA");
        familyController.displayAllFamilies();
        familyController.displayAllFamilies();
        familyController.count();
        familyController.getFamilyById(2);
        familyController.getPets(1);
        familyController.deleteAllChildrenOlderThen(17);
        familyController.displayAllFamilies();

        familyController.addPet(5, nemo);
        familyController.displayAllFamilies();
        familyController.addPet(5, tuzik);
        familyController.displayAllFamilies();
        System.out.println(mother.getYearInMilisec());
        mother.describeAge();
        father.describeAge();
        Human adoptedChild = new Human("Donald", "Tramp","12/12/2020",89);
        System.out.println(adoptedChild);
        familyController.adoptChild(popov, adoptedChild);

    }

}

