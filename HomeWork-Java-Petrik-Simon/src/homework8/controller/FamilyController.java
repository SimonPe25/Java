package homework8.controller;

import homework8.Family;
import homework8.dao.CollectionFamily;
import homework8.service.FamilyService;

import java.util.List;

public class FamilyController extends FamilyService {

    private FamilyService familyService;



    public FamilyController(CollectionFamily collectionFamily) {
        super(collectionFamily);
        this.familyService = familyService;
    }

    @Override
    public void getAllFamilies() {
     familyService.getAllFamilies();
    }
}
