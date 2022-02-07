package homework9.dao;

import homework9.Family;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionFamily  implements FamilyDao {

    private List<Family> familyList = new ArrayList<>();

    public List<Family> getFamilyList() {
        return Collections.unmodifiableList(familyList);
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
    public void saveAll(List<Family> list){
        list.forEach(f->{
            this.saveFamily(f);
        });
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


