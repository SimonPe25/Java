package homework9.service;

import homework9.Family;
import homework9.Human;
import homework9.Pet;
import homework9.dao.CollectionFamily;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static homework8.Family.countFamily;
import static java.lang.System.out;

public class FamilyService {
    private static CollectionFamily collectionFamily;
    static int countAddFamily = 0;
    private int length;

    public FamilyService(CollectionFamily collectionFamily) {
        this.collectionFamily = collectionFamily;
    }

    //получить список всех семей.
    public List<Family> getAllFamilies() {
        out.println("Список семей - " + collectionFamily);
        return null;
    }

    public void displayAllFamilies() {
        List<Family> newStreamFam = collectionFamily.getFamilyList();
        newStreamFam.stream()
                .map((s) -> s + " ")
                .forEach(
                        (s) -> out.println(s)
                );
    }

    //dывести на экран все семьи (в индексированном списке)
    public void getFamilyByIndex(int index) {
        collectionFamily.getFamilyByIndex(index);
    }

    public void deleteFamily(int index) {
        collectionFamily.deleteFamily(index);
    }

    public void deleteFamily(Family family) {
        collectionFamily.deleteFamily(family);
    }

    public void saveFamily(Family family) {
        collectionFamily.saveFamily(family);
    }

    public void getFamiliesBiggerThan(List<Family> allFamaly, int index) {
        for (int i = 0; i < allFamaly.size(); i++) {
            int number = allFamaly.get(i).getChildrens().length;
            int matherAndFather = 2;
            int sum = number + matherAndFather;
            if (sum > index) {
                out.println(i + ":" + "Человек в семье - " + sum + ", Семья: " + allFamaly.get(i));
            }
        }
    }
    public void getFamiliesBiggerThan(int index){
        List<Family> newStreamFam = collectionFamily.getFamilyList();
        out.println("----------------------------");
        newStreamFam.stream()
                .map(s -> s.getChildrens().length)
               // .filter(s -> getAllFamilies().size())
                .forEach(s->System.out.println());

    }

    public void getFamiliesLessThan(List<Family> allFamaly, int index) {
        for (int i = 0; i < allFamaly.size(); i++) {
            int number = allFamaly.get(i).getChildrens().length;
            int matherAndFather = 2;
            int sum = number + matherAndFather;
            if (sum < index) {
                out.println(i + ":" + "Человек в семье - " + sum + ", Семья: " + allFamaly.get(i));
            }
        }
    }

    public void countFamiliesWithMemberNumber(List<Family> allFamaly, int index) {

        for (int i = 0; i < allFamaly.size(); i++) {
            int number = allFamaly.get(i).getChildrens().length;
            int matherAndFather = 2;

            int sum = number + matherAndFather;
            if (sum == index) {
                countAddFamily++;
            }
        }
        out.println("Количество семей = " + countAddFamily + ", с равным количеством людей индексу - " + index);

    }

    public void createNewFamily(Human person1, Human person2) {
        out.println("collectionFamily" + collectionFamily);
        Family autoNewFamily = new Family(person1, person2);
        collectionFamily.saveFamily(autoNewFamily);
    }

    public void deleteFamilyByIndex(int index) {
        collectionFamily.deleteFamily(index);
    }


    public void bornChild(Family family, String man, String woman) {
        var random = new SecureRandom();
        var list = Arrays.asList(man, woman);
        var randomElement = list.get(random.nextInt(list.size()));

        Human children = new Human(randomElement);
        family.addChildren(children);
    }

    public void adoptChild(Family family, Human human) {
        family.addChildren(human);
        out.println("Обновлённая семья с приемным ребенком - " + family);
    }

    public void deleteAllChildrenOlderThen(int age) {
          List<Family> delChild = collectionFamily.getFamilyList();
        List<Family> familyList = delChild.stream().
                map(f -> {
                    f.setChildrens(Arrays.stream(f.getChildrens()).filter(c -> c.getYear() <= age).toArray(Human[]::new));
                    out.println("FFFFF - " + Arrays.toString(f.getChildrens()));
               return f;
                }).toList();
          collectionFamily.saveAll(familyList);

        out.println("familyList " +familyList);
        out.println(delChild.stream().flatMap(i-> Arrays.stream(i.getChildrens()).map(c-> c.getYear())).collect(Collectors.toList()));
    }

    public void count() {
        out.println("Всего количество семей: " + countFamily + ".");
    }

    public void getFamilyById(int index) {
        collectionFamily.getFamilyByIndex(index);
    }

    public void getPets(int index) {
        List<Family> newF = collectionFamily.getFamilyList();
        for (int i = 0; i < newF.size(); i++) {
            out.println("Животные в семье по индексу - " + index + " - " + newF.get(index).getPet());
            return;
        }

    }
//    public void addPet(int index, Pet pet){
//        List<Family> addPet = collectionFamily.getFamilyList();
//        addPet.get(index).addNewPet(pet);
//
//        for (int i = 0; i <addPet.size() ; i++) {
//            out.println();;
//
////            for (int j = 0; j < addPet.le; j++) {
////
////            }
//            return;
//        }
//
//
//    }
}



