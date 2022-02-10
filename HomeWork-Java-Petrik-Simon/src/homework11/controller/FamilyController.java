package homework11.controller;

import homework11.Family;
import homework11.Human;
import homework11.Pet;
import homework11.service.FamilyService;

import java.text.ParseException;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.System.out;

public class FamilyController {

    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    public void getAllFamilies() {
        familyService.getAllFamilies();
    }
    public void displayAllFamilies() {familyService.displayAllFamilies();}
    public void getFamilyByIndex(int index) {
        familyService.getFamilyByIndex(index);
    }
    public void deleteFamily(int index) {familyService.deleteFamily(index);}
    public void deleteFamily(Family family){familyService.deleteFamily(family);}
    public void saveFamily(Family family) {familyService.saveFamily(family);}
    public void getFamiliesBiggerThan(List<Family> allFamaly, int index){
        familyService.getFamiliesBiggerThan(allFamaly, index);}
    public void getFamiliesLessThan(List<Family> allFamaly, int index){
        familyService.getFamiliesLessThan(allFamaly, index);}
    public void countFamiliesWithMemberNumber (List<Family> allFamaly, int index){
        familyService.countFamiliesWithMemberNumber(allFamaly, index);}
    public void createNewFamily(Human person1, Human person2){
        familyService.createNewFamily(person1, person2);
    }
    public void deleteFamilyByIndex(int index){
        familyService.deleteFamilyByIndex(index);
    }
    public void bornChild(Family family, String man, String woman){
        familyService.bornChild(family, man, woman);
    }
    public void adoptChild(Family family, Human human){
        familyService.adoptChild(family,human);
    }
    public void deleteAllChildrenOlderThen(int index){
       familyService.deleteAllChildrenOlderThen(index);
    }
    public void count(){familyService.count();}
    public Family getFamilyById(int index){
        familyService.getFamilyById(index);
        return null;
    }
    public void getPets(int index){
        familyService.getPets(index);
    }
    public void addPet(int index, Pet pet){
       familyService.addPet(index, pet);
        }
    public void getFamilywithIndex() {
        familyService.getFamilywithIndex();
    }
    public List<Family> getFamilyList() {
        return familyService.getFamilyList();
    }
    public void bornChildUseID(int id, String man, String woman){
        familyService.bornChildUseID(id, man, woman);
    }
    public void adobeNewChild(int id, String fio, String birthdate, int iq ) throws ParseException {
       familyService.adobeNewChild(id, fio, birthdate, iq);
    }




}
