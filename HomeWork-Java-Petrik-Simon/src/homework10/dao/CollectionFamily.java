package homework10.dao;

import homework10.Family;
import homework10.Pet;

import java.util.List;
import java.util.Set;


public class CollectionFamily  implements FamilyDao {

    private List<Family> familyList;

    public List<Family> getFamilyList() {
        return familyList;
    }
    public void saveAll(List<Family> list){
        list.forEach(f->{
            this.saveFamily(f);
        });
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
        this.familyList = familyList;
    }

    @Override
    public void getAllFamilies() {
        for(int i = 0; i < familyList.size(); i++){
            System.out.println( i+": " + familyList.get(i));
        }
    }
    @Override
    public void getFamilyByIndex(int index) {
            if (index >= familyList.size()){
                System.out.println("Нет такого индекса семьи : " + index + ", " + "null");
                return;
            }
        System.out.println("Получение семьи по индексу : " + index + ", " + familyList.get(index));
    }

    @Override
    public void deleteFamily(int index) {
        if (index >= familyList.size()) {
            System.out.println(isDelete(index));
            return;
        }
        System.out.println(isDelete(index));
        familyList.remove(index);
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
        if (!familyList.contains(family)) {
            familyList.add(family);
        }
    }

    @Override
    public String toString() {
        return "CollectionFamily{" +
                "familyList=" + familyList +
                '}';
    }
}


