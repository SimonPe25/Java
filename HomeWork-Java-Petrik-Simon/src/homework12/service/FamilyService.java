package homework12.service;

import homework11.Factorial;
import homework11.FamilyOverflowException;
import homework12.*;
import homework12.dao.CollectionFamily;

import java.io.*;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
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

    public List<Family> getFamilyList() {
        return collectionFamily.getFamilyList();
    }
    public  void setFamily(List<Family> listFamily){
        collectionFamily.setFamilyList(listFamily);
    }

    public void writeFile() throws IOException {
      collectionFamily.writeFile();
    }
    public void loadData() throws IOException {
        collectionFamily.loadData();
    }

    //получить список всех семей.
    public List<Family> getAllFamilies() {
        System.out.println("Список семей - " + collectionFamily);
        return null;
    }
    public void displayAllFamilies() {
        List<Family> newStreamFam = collectionFamily.getFamilyList();
        for (int i = 0; i < collectionFamily.getFamilyList().size(); i++) {
            collectionFamily.getFamilyList().get(i).prettyFormat();

        }
    }
    public void getFamilyByIndex(int index) {
        collectionFamily.getFamilyByIndex(index);
    }
    public void getFamilywithIndex() {
        List<Family> getFamIndex = collectionFamily.getFamilyList();
        if (getFamIndex.size() < 1 ) {
            out.println("Извините, в списке нет семей ((, выберите пункт №1 для загрузки семей");
        }
        for (int i = 0; i < getFamIndex.size(); i++) {
            out.println(i+1 +" - " +  getFamIndex.get(i));
        }
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

            if (newFamilyBigger.length < index) {
                out.println("Извините, семей с таким колличеством " + index + " нет");
                return;
            }
            Arrays.stream(newFamilyBigger).sorted((f1, f2) -> f1.getChildrens().length - f2.getChildrens().length);
            out.println("                        ***                         ");
            out.println("Семьи с количеством людей больше чем - " + index);
            Arrays.stream(newFamilyBigger).forEach(Family::prettyFormat);

    }
    public void getFamiliesLessThan(List<Family> allFamaly, int index) {
        int parents = 2;
        Family[] newFamilyBigger= allFamaly.stream().filter(i-> (i.getChildrens().length +parents) < index).toArray(Family[]::new);
        Arrays.stream(newFamilyBigger).sorted((f1, f2) -> f1.getChildrens().length - f2.getChildrens().length);
        out.println("                        ***                         ");
        out.println("Семьи с количеством людей меньше чем - " + index);
        Arrays.stream(newFamilyBigger).forEach(Family::prettyFormat);
    }
    public void countFamiliesWithMemberNumber(List<Family> family, int index) {
        try {
            int parents = 2;
            Family[] newFamily= family.stream().filter(i-> (i.getChildrens().length +parents) == index).toArray(Family[]::new);
            out.println("Семьи с количеством людей - " + index);
            Arrays.stream(newFamily).forEach(Family::prettyFormat);

        } catch ( Exception e ){
            out.println("Пока не созданно не одной семьи, создайте семью выбрав пункт №6");

        }
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
        out.println("Father - " + person2);
        out.println("Mather - " + person1);
        Family autoNewFamily = new Family(person1, person2);
        out.println("New Family - " + autoNewFamily);
        collectionFamily.saveFamily(autoNewFamily);


    }

    public void deleteFamilyByIndex(int index) {
        collectionFamily.deleteFamily(index);
    }
    public void bornChildUseID(int id, String man, String woman){
        List<Family> add = collectionFamily.getFamilyList();
        for (int i = 0; i < add.size(); i++) {
            if (i == (id-1)) {
                Family family = add.get(i);
                bornChild(family, man, woman);
            }
        }
    }
    public void bornChild(Family family, String man, String woman) {
        var random = new SecureRandom();
        var list = Arrays.asList(man, woman);
        String randomElement = list.get(random.nextInt(list.size()));
        Human child = new Human(randomElement);

        if (child.getName() == man){
            child.setGender("boy");
        }
        if (child.getName() == woman){
            child.setGender("girl");
        }
        try{
            Family fam =family;
            int numP = 2;
            int num = fam.getChildrens().length + numP;
            out.println("ЧИСЛО ЧЕЛОВЕК в СЕМЬЕ - " + num);
            int result = Factorial.getFactorial(num);
            out.println(result);
            if (fam == null) {
                out.println("Семьи с таким id нет, ведите меньше число");
                return;
            }
            family.addChildren(child);
            getFamilywithIndex();
        }
        catch(FamilyOverflowException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

    }
    public void adobeNewChild(int id, String fio, String birthdate, int iq ) throws ParseException {
        StringTokenizer tokenizer = new StringTokenizer(fio);
        String firstArg = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
        String secondArg = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
        String threeArg = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
       Human child = new Human(firstArg, secondArg, birthdate, iq);
        try{
            Family fam =collectionFamily.getFamilyByIndex((id-1));
            int numP = 2;
            int num = fam.getChildrens().length + numP;
            out.println("ЧИСЛО ЧЕЛОВЕК в СЕМЬЕ - " + num);
            int result = Factorial.getFactorial(num);
            System.out.println(result);
            if (collectionFamily.getFamilyByIndex((id-1)) == null) {
                out.println("Семьи с таким id нет, ведите меньше число");
                return;
            }
            adoptChild(collectionFamily.getFamilyByIndex((id-1)), child);
            getFamilywithIndex();
        }
        catch(FamilyOverflowException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }

    public void adoptChild(Family family, Human human) {
        family.addChildren(human);
        System.out.println("Обновлённая семья с приемным ребенком - " + family);
    }
    public void deleteAllChildrenOlderThen(int age) {
        List<Family> delChild = collectionFamily.getFamilyList();
        List<Family> familyList = delChild.stream().
                peek(f -> {
                    f.setChildrens(Arrays.stream(f.getChildrens()).filter(c -> c.getBirthDate() <= age).toArray(Human[]::new));
                    out.println("Список детей если есть - " + Arrays.toString(f.getChildrens()));
                }).toList();
        out.println("familyList " +familyList);
        out.println(delChild.stream().flatMap(i-> Arrays.stream(i.getChildrens()).map(Human::getBirthDate)).collect(Collectors.toList()));
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




