package homework11;

import homework11.controller.FamilyController;
import homework11.dao.CollectionFamily;
import homework11.service.FamilyService;
import java.text.ParseException;
import java.util.*;

import static homework11.Human.DayOfWeek.*;
import static homework11.Human.countHuman;
import static homework11.Human.getCountFamily;
import static javax.swing.UIManager.get;


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
        Human sister = new Human("girl", "Lena", "Popova",20,89);
        Human brother = new Human("boy","Anatoliy", "Averin", 17, 95);
        Human elderSister = new Human("girl","Olya", "Averina", 30, 98);
        Human elderBrother = new Human("boy","Victor", "Averin",10, 31);
        Human smallSister = new Human("girl", "Lena", "Kushnareva",25, 12);

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


       Human matherFamily2 = new Human("Natasha", "Koreneva", 23,98, scheduleMather);
       Human fatherFamily2 = new Human("Vitaliy", "Korenev", 35, 99, scheduleFather);
        Human fatherPopov = new Human("Aleksey", "Popov","15-05-1998",99);
       Human matherPopov = new Human<>("Katia", "Popova","12-12-2000",98);
       matherPopov.setSchedule(scheduleMather);
       fatherPopov.setSchedule(scheduleFather);

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
        Family popov = new Family(matherPopov, fatherPopov, childrenPopov);


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

        familyController.createNewFamily(brother,sister);

        familyController.displayAllFamilies();
        familyController.deleteFamilyByIndex(4);
        familyController.displayAllFamilies();
        familyController.bornChild(popov, "PETR", "KAROLINA");
        familyController.displayAllFamilies();
        familyController.displayAllFamilies();
        familyController.count();
        familyController.getFamilyById(2);
        familyController.getPets(1);
      //  familyController.deleteAllChildrenOlderThen(17);
        familyController.displayAllFamilies();

        familyController.addPet(5, nemo);
        familyController.displayAllFamilies();
        familyController.addPet(5, tuzik);
        familyController.displayAllFamilies();
        System.out.println(mother.getYearInMilisec());
        mother.describeAge();
        father.describeAge();
        Human adoptedChild = new Human("boy","Donald", "Tramp","12/12/2020",89);
        System.out.println(adoptedChild);
        familyController.adoptChild(popov, adoptedChild);
        System.out.println("----------display family-----------");
        familyController.displayAllFamilies();
        familyController.getFamiliesBiggerThan(allFamaly, 3);
        familyController.getFamiliesLessThan(allFamaly,3);
        familyController.countFamiliesWithMemberNumber(allFamaly,4);
        familyController.deleteAllChildrenOlderThen(25);
        Human aleshaPopov = new Human<>("boy","Alesha","Popov","12-12-1995",89);
        popov.addChildren(aleshaPopov);
      //  popov.prettyFormat();
       // ivanov.prettyFormat();
        //familyController.displayAllFamilies();
        familyController.getFamiliesBiggerThan(allFamaly,6);
        System.out.println("-----------  -------------------------------------------------------------------");
        System.out.println("-------- -------------------------------------------------------------------------");
        System.out.println("------ --------------------------------------------------------------------------");
        System.out.println("----- ----------------------------------------------------------------------------");
        System.out.println("----- ---------------------------------------------------------------------------");
        System.out.println("------ --------------------------------------------------------------------------");
        System.out.println("------- --------------------------------------------------------------------------");
        System.out.println("-------- -------------------------------------------------------------------------");
        familyController.displayAllFamilies();
        familyController.count();

        Human testMother = new Human<>("Victoriya", "Plotnikova", 85);
        Human testFather = new Human<>("Oleg", "Plotnikov", 98);
        familyController.createNewFamily(testFather,testMother);
        familyController.count();
        familyController.getAllFamilies();
        familyController.displayAllFamilies();
        System.out.println("Start add----------------------------------------------------------------------------");
        familyController.adobeNewChild(1, "SAFONOV NIKOLAY OLEGOVICH", "12/12/2005",89);



        startProgramm();
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.println("Hello my friend " + name + " please choose your number");


        while (true) {
            System.out.println("Please enter number only");
            int num = Integer.parseInt(in.nextLine());
            try {

                if (num == 1){
                    System.out.println("Create new family");
                    System.out.println("Create new person");
                    System.out.println("Please name mather");
                    String matherName = in.nextLine();
                    System.out.println("Please sureName mather");
                    String sureName = in.nextLine();
                    System.out.println("Please dateBirth mather");
                    String dateBirth = in.nextLine();
                    System.out.println("Please iq mather");
                    int iq = Integer.parseInt(in.nextLine());
                    System.out.println("Create new person father");
                    System.out.println("Please name father");
                    String fatherName = in.nextLine();
                    System.out.println("Please sureName father");
                    String fatherSureName = in.nextLine();
                    System.out.println("Please dateBirth father");
                    String fatherBirth = in.nextLine();
                    System.out.println("Please iq father");
                    int fatherIq = Integer.parseInt(in.nextLine());
                    Human person1 = new Human(matherName,sureName,dateBirth,iq);
                    Human person2 = new Human(fatherName,fatherSureName,fatherBirth,fatherIq);
                    familyController.createNewFamily(person1, person2);
                    familyController.displayAllFamilies();
                }
                if (num==2){
                   familyController.getFamilywithIndex();
                }
                if (num ==3){
                    System.out.println("Please enter number for get family with people bigger then your number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.getFamiliesBiggerThan(getFam,number);
                }
                if (num ==4){
                    System.out.println("Please enter number for get family with people less then your number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.getFamiliesLessThan(getFam,number);
                }
                if (num ==4){
                    System.out.println("Please enter number for get family with people less then your number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.getFamiliesLessThan(getFam,number);
                }
                if (num ==5){
                    System.out.println("Please enter number for get family with people equals number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.countFamiliesWithMemberNumber(getFam, number);
                }
                if (num == 6){
                    System.out.println("Create new family");
                    System.out.println("Please name mather");
                    String matherName = in.nextLine();
                    System.out.println("Please sureName mather");
                    String sureName = in.nextLine();
                    System.out.println("Please yearBirth mather");
                    String yearBirth = in.nextLine();
                    System.out.println("Please monthBirth mather");
                    String monthBirth = in.nextLine();
                    System.out.println("Please dayBirth mather");
                    String dayBirth = in.nextLine();
                    System.out.println("Please iq mather");
                    int iq = Integer.parseInt(in.nextLine());


                    System.out.println("Create new person father");
                    System.out.println("Please name father");
                    String fatherName = in.nextLine();
                    System.out.println("Please sureName father");
                    String fatherSureName = in.nextLine();
                    System.out.println("Please yearBirth father");
                    String yearBirthFather= in.nextLine();
                    System.out.println("Please monthBirth father");
                    String monthBirthFather= in.nextLine();
                    System.out.println("Please dayBirth father");
                    String dayBirthFather= in.nextLine();
                    System.out.println("Please iq father");
                    int fatherIq = Integer.parseInt(in.nextLine());
                    String birthMather = dayBirth+"/"+monthBirth+"/"+yearBirth;
                    String birthFather = dayBirthFather+"/"+monthBirthFather+"/"+yearBirthFather;
                    Human person1 = new Human(matherName,sureName,birthMather,iq);
                    Human person2 = new Human(fatherName,fatherSureName, birthFather,fatherIq);
                    familyController.createNewFamily(person1, person2);
                    familyController.displayAllFamilies();
                }
                if (num ==7){
                    familyController.getFamilywithIndex();
                    System.out.println("Please enter number of index for delete family equals number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.deleteFamilyByIndex(number-1);
                    familyController.getFamilywithIndex();
                }
                if (num ==8){
                    familyController.getFamilywithIndex();
                    System.out.println("Редактировать семью по индексу семьи в общем списке \n" +
                            "  - 1. Родить ребенка\n" +
                            "    - запросить порядковый номер семьи (ID)\n" +
                            "    - запросить необходимые данные (какое имя дать мальчику, какое девочке)\n" +
                            "  - 2. Усыновить ребенка\n" +
                            "    - запросить порядковый номер семьи (ID)\n" +
                            "    - запросить необходимые данные (ФИО, год рождения, интеллект)\n" +
                            "  - 3. Вернуться в главное меню  \n");
                    System.out.println("Выберите подпункт меню, вводите только цифры");
                    int number = Integer.parseInt(in.nextLine());
                    if (number >3 ){
                        System.out.println("Введите число меньше 3");
                    }
                    if (number==1){
                        System.out.println("Введите ID");
                        int id = Integer.parseInt(in.nextLine());
                        System.out.println("Введите имя Мальчика");
                        String idBoy = in.nextLine();
                        System.out.println("Введите имя Девочки");
                        String idGirl = in.nextLine();
                        familyController.bornChildUseID(id, idBoy, idGirl);
                    }
                    if (number==2){
                        System.out.println("Введите ID");
                        int iD = Integer.parseInt(in.nextLine());
                        System.out.println("Введите ФИО");
                        String nameChild = in.nextLine();
                        System.out.println("Введите год рождения");
                        String birthDate = in.nextLine();
                        System.out.println("Введите интелект");
                        int iq = Integer.parseInt(in.nextLine());
                        familyController.adobeNewChild(iD, nameChild,birthDate, iq );
                       // familyController.getFamilywithIndex();
                    }
                    if (number==3){
                        System.out.println("Выберите категорию из основного меню");
                    }
                }
                if (num ==9){
                    System.out.println("Удалить всех детей старше возраста");
                    System.out.println("Введите возраст старше которого нужно удалить");
                    int age = Integer.parseInt(in.nextLine());
                    familyController.deleteAllChildrenOlderThen(age);
                    familyController.getFamilywithIndex();
                }

            } catch (NumberFormatException e) {
                System.err.println("\n" + "Wrong string format!");
                System.out.println(num + " please, try again only numbers.");
            }
        }
    }
    public static void startProgramm(){
        ComandList comandList = new ComandList();
        comandList.start();
    }
}

