package homework8.service;

import homework8.Family;
import homework8.dao.CollectionFamily;

import java.util.List;

public class FamilyService extends CollectionFamily {
    private List<Family> familyList;

    public FamilyService(List<Family> familyList, List<Family> familyList1) {
        super();
        this.familyList = familyList1;
    }

    public FamilyService(CollectionFamily collectionFamily) {
        super();
    }
// private CollectionFamily collectionFamily;




    @Override
    public void getAllFamilies() {
        super.getAllFamilies();
    }
}
