package homework8.dao;

import homework8.Family;

import java.util.List;

public class CollectionFamily  implements FamilyDao{
     private List<Family> familyList;



    public CollectionFamily() {
        this.familyList = familyList;
    }

    @Override
    public void getAllFamilies() {
        System.out.println("start2 - " + familyList);
    }

    @Override
    public String toString() {
        return "CollectionFamily{" +
                "familyList=" + familyList +
                '}';
    }}


