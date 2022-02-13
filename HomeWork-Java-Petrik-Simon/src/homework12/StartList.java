package homework12;

import homework12.controller.FamilyController;
import homework12.dao.CollectionFamily;
import homework12.service.FamilyService;

import java.text.ParseException;
import java.util.*;

public class StartList {


    public void startList() throws ParseException {
        List<Family> family = new ArrayList<>();
        CollectionFamily collectionFamily = new CollectionFamily(family);
        FamilyService familyService = new FamilyService(collectionFamily);
        FamilyController familyController = new FamilyController(familyService);
        List<Human> childrensList = new ArrayList<>();
        Human mother = new Human("Olga", "Averina", "05/12/1985", 85);
        Human father = new Human("Konstantin", "Averin", "25/02/1981", 95);
        Human sister = new Human("girl", "Lena", "Popova", "06/08/2009", 89);
        Human brother = new Human("boy", "Anatoliy", "Averin", "25/04/2004", 95);
        Human elderSister = new Human("girl", "Olya", "Averina", "12/12/1999", 98);
        Human elderBrother = new Human("boy", "Victor", "Averin", "12/12/1998", 31);
        Human smallSister = new Human("girl", "Lena", "Kushnareva", "25/01/2007", 12);
        childrensList.add(0, sister);
        childrensList.add(1, brother);
        childrensList.add(2, elderSister);
        childrensList.add(3, elderBrother);
        childrensList.add(4, smallSister);

        List<Human> childrenEgorov = new ArrayList<>();
        childrenEgorov.add(sister);
        childrenEgorov.add(elderBrother);
        List<Human> childrenPopov = new ArrayList<>();
        childrenPopov.add(sister);
        Set<String> habitsDog = new HashSet<>();
        habitsDog.add("jump");
        habitsDog.add("GAFF");
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
        Set<String> petGroup = new HashSet<>();
        Pet tuzik = new Dog("Tuzik", 10, 45, habitsDog);
        Pet nemo = new Fish("Nemo", 1, 58, habitsFish);
        Pet barsik = new RoboCat("Barsik", 5, 68, habitsRoboCat);
        Pet pushok = new DomesticCat("Pushok", 6, 87, habitsDomesticCat);
        Map<String, String> scheduleFather = new HashMap<String, String>();
        scheduleFather.put("monday", "Java consultation");
        scheduleFather.put("wednesday", "React consultation");
        scheduleFather.put("friday", "JavaScript consultation");

        Map<String, String> scheduleMather = new HashMap<String, String>();
        scheduleMather.put("tuesday", "Sport");
        scheduleMather.put("thursday", "work");
        scheduleMather.put("saturday", "Go for a walk");
        Human matherFamily2 = new Human("Natasha", "Koreneva", "28/03/1977",  85, scheduleMather);
        Human fatherFamily2 = new Human("Vitaliy", "Korenev", "14/06/1975", 99, scheduleFather);
        Human fatherPopov = new Human("Aleksey", "Popov", "07/09/1981", 99);
        Human matherPopov = new Human("Katia", "Popova", "18/08/1985", 98);
        Human matherEgorov = new Human("Liza", "Kolya", "29/12/1992",87);


        matherPopov.setSchedule(scheduleMather);
        fatherPopov.setSchedule(scheduleFather);
        Family pushkarev = new Family(matherEgorov, fatherFamily2, childrensList, petGroup);
        Family ivanov = new Family(matherFamily2, fatherFamily2, childrensList, petGroup);
        Family egorov = new Family(matherFamily2, fatherFamily2, childrenEgorov);
        Family popov = new Family(matherPopov, fatherPopov, childrenPopov);
        List<Family> allFamaly = new ArrayList<>();
        allFamaly.add(pushkarev);
        allFamaly.add(ivanov);
        allFamaly.add(egorov);
        allFamaly.add(popov);
        familyController.setFamily(allFamaly);
        System.out.println("Загрузка прошла успешно");

    }
}
