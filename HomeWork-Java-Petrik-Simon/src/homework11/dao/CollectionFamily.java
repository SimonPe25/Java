package homework11.dao;

import homework11.Family;
import homework11.Pet;

import java.util.List;
import java.util.Set;


public class CollectionFamily  implements FamilyDao {

    private List<Family> familyList;

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

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
        System.out.println("ЭТТТТТТТТТТТТТТТТТТТТ - " + family);
        familyList.add(family);
        System.out.println("Это новая семья -" + familyList.toString());
        setFamilyList(familyList);
//        if (!familyList.contains(family)) {
//            familyList.add(family);
//            saveAll(familyList);
//        }
    }

    @Override
    public String toString() {
        return "CollectionFamily{" +
                "familyList=" + familyList +
                '}';
    }
}


