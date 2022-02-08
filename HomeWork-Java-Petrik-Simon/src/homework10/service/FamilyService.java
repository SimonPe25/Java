package homework10.service;

import homework10.Family;
import homework10.Human;
import homework10.Pet;
import homework10.dao.CollectionFamily;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println("Список семей - " + collectionFamily);
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
        int parents = 2;
        Family[] newFamilyBigger= allFamaly.stream().filter(i-> (i.getChildrens().length +parents) > index).toArray(Family[]::new);
        out.println("newFamilyBigger  - " + Arrays.toString(newFamilyBigger));
        Arrays.stream(newFamilyBigger).sorted((f1, f2) -> f1.getChildrens().length - f2.getChildrens().length);
        Arrays.stream(newFamilyBigger).forEach(p->
                out.println("Количество членов " + (p.getChildrens().length + parents) + " в семье: "+ p));
    }
    public void getFamiliesLessThan(List<Family> allFamaly, int index) {
        int parents = 2;
        Family[] newFamilyBigger= allFamaly.stream().filter(i-> (i.getChildrens().length +parents) < index).toArray(Family[]::new);
        out.println("newFamilyBigger  - " + Arrays.toString(newFamilyBigger));
        Arrays.stream(newFamilyBigger).sorted((f1, f2) -> f1.getChildrens().length - f2.getChildrens().length);
        Arrays.stream(newFamilyBigger).forEach(p->
                out.println("Количество членов " + (p.getChildrens().length + parents) + " в семье: "+ p));
    }
    public void countFamiliesWithMemberNumber(List<Family> allFamaly, int index) {
        int parents = 2;
        Family[] newFamily= allFamaly.stream().filter(i-> (i.getChildrens().length +parents) == index).toArray(Family[]::new);
        out.println("Семьи с количеством людей - " + index + " - это -" + Arrays.toString(newFamily));
    }

    public void countFamiliesWithMemberNumber1(List<Family> allFamaly, int index) {
        for (int i = 0; i < allFamaly.size(); i++) {
            int number = allFamaly.get(i).getChildrens().length;
            int matherAndFather = 2;
            int sum = number + matherAndFather;
            if (sum == index) {
                countAddFamily++;
            }
        }
        System.out.println("Количество семей = " + countAddFamily + ", с равным количеством людей индексу - " + index);
    }

    public void createNewFamily(Human person1, Human person2) {
        System.out.println("collectionFamily" + collectionFamily);
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
        System.out.println("Обновлённая семья с приемным ребенком - " + family);
    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> delChild = collectionFamily.getFamilyList();
        List<Family> familyList = delChild.stream().
                peek(f -> {
                    f.setChildrens(Arrays.stream(f.getChildrens()).filter(c -> c.getYear() <= age).toArray(Human[]::new));
                    out.println("Список детей если есть - " + Arrays.toString(f.getChildrens()));
                }).toList();
        collectionFamily.saveAll(familyList);

        out.println("familyList " +familyList);
        out.println(delChild.stream().flatMap(i-> Arrays.stream(i.getChildrens()).map(Human::getYear)).collect(Collectors.toList()));
    }
    public void count() {
        System.out.println("Всего количество семей: " + countFamily + ".");
    }

    public void getFamilyById(int index) {
        collectionFamily.getFamilyByIndex(index);
    }

    public void getPets(int index) {
        List<Family> newF = collectionFamily.getFamilyList();
        for (int i = 0; i < newF.size(); i++) {
            System.out.println("Животные в семье по индексу - " + index + " - " + newF.get(index).getPet());
            return;
        }
    }
    public void addPet(int index, Pet pet){
        collectionFamily.addNewPet(pet);
        }
    }




