package homework12.dao;

import homework12.Family;
import homework12.Pet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class CollectionFamily  implements FamilyDao {

    private List<Family> familyList = new ArrayList<>();

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }


    public void writeFile () throws IOException {
        FileOutputStream fos = new FileOutputStream("Femaly.txt");
        try(ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            for (Family family : familyList) {
                oos.writeObject(family);
            }
        } catch (IOException e){
            System.out.println("ERROR - " +e);
        }
        System.out.println("Запись в файл - Femaly.txt, прошла успешно!!!");
    }

    public void loadData() throws IOException {
        FileInputStream fis = new FileInputStream("Femaly.txt");
        ObjectInputStream oin = new ObjectInputStream(fis);

        while (true) {
            try {
                familyList.add((Family) oin.readObject());
            } catch (EOFException e) {
                System.out.println("Нет данных");
                break;
            } catch (StreamCorruptedException | ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("Нет данных");
            }
        }
        System.out.println("Считывание данных прошло успешно!!!");
        System.out.println(familyList);
        fis.close();
    }

    public void addNewPet(Pet pet){
        for (int i = 0; i < familyList.size(); i++) {
      Set<String> addP = familyList.get(i).getPet();
       addP.add(String.valueOf(pet));
            System.out.println("Новый массив с животными - " + addP);
            return;
        }
    }

    public CollectionFamily(List<Family> familyList) {
        this.familyList = getFamilyList();
    }

    @Override
    public void getAllFamilies() {
        for(int i = 0; i < familyList.size(); i++){
            System.out.println( i+": " + familyList.get(i));
        }
    }
    @Override
    public Family getFamilyByIndex(int index) {
            if (index >= familyList.size()){
                System.out.println("Нет такого индекса семьи : " + index + ", " + "null");
                return null;
            }
            Family f = familyList.get(index);
        System.out.println("F ---" + f);
        return f;
    }

    @Override
    public void deleteFamily(int index) {
        if (index >= familyList.size()) {
            System.out.println(isDelete(index));
            return;
        }
        System.out.println(isDelete(index));
        familyList.remove(index);
      //  saveAll(familyList);

    }
    public boolean isDelete (int index)
    {
        return index < familyList.size();
    }
    public boolean isDeleteFamily (Family family)
    {
        return familyList.contains(family);
    }

    @Override
    public void deleteFamily(Family family) {
        if (!familyList.contains(family)){
            System.out.println(isDeleteFamily(family));
            System.out.println("Deletion failed");
            return;
        }
        System.out.println(isDeleteFamily(family));
        System.out.println("Removal successful!!!");
        familyList.remove(family);
    }

    @Override
    public void saveFamily(Family family) {
        getFamilyList().add(family);
    }

    @Override
    public String toString() {
        return "CollectionFamily{" +
                "familyList=" + familyList +
                '}';
    }
}


