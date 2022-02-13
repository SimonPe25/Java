package homework12.dao;

import homework12.Family;

public interface FamilyDao {

     void getAllFamilies();
     Family getFamilyByIndex(int index);
     void deleteFamily(int index);
     void deleteFamily(Family family);
     void saveFamily(Family family);
}

