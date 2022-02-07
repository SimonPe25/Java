package homework9;

import java.util.*;

public class Family {

    private Human mother;
    private Human father;
    private Human[] childrens = new Human[0];
    private Set<String> pet;
    static int myFamily = 0;
    public static int countFamily = 0;
    static int countHum = 0;

    public Human[] getChildrens() {
        return childrens;
    }
    public void addNewPet(Pet pet){

    }
//    public void addChildren(Human children){
//        Human[] humans = Arrays.copyOf(childrens, childrens.length + 1);
//        children.setFamily(this);
//        humans[childrens.length] = children;
//        childrens = humans;
//    }
    public Family(Human mother, Human father) {
        countFamily++;
        this.mother = mother;
        this.father = father;
    }
    public static int getCountFamily() {
        return countFamily;
    }


    public Family(Human mother, Human father, List<Human> childrens, Set<String> pet) {
        countFamily++;
        this.mother = mother;
        this.father = father;
        this.childrens = childrens.toArray(new Human[0]);
        this.pet = pet;
    }
    public Family(Human mother, Human father, List<Human> childrens) {
        this.mother = mother;
        this.father = father;
        this.childrens = childrens.toArray(new Human[0]);
    }

    public void addChildren(Human children){
        Human[] humans = Arrays.copyOf(childrens, childrens.length + 1);
        children.setFamily(this);
        humans[childrens.length] = children;
        childrens = humans;
    }
    public void deleteChild (int index){
        if (index < 0 || index >= childrens.length) {
            return;
        }
        Human[] humans = new Human[childrens.length-1];
        System.arraycopy(childrens, 0, humans, 0, index);
        System.arraycopy(childrens, index + 1, humans, index, childrens.length - index-1);
        childrens = humans;
    }
//    public  void getFamily(){
//        return getMother;
//    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildrens(Human sister) {
        return childrens;
    }

    public void setChildrens(Human[] childrens) {
        this.childrens = childrens;
    }

    public Set<String> getPet() {
        return pet;
    }

    public void setPet(Set<String> pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(childrens, family.childrens);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father);
        result = 31 * result + Arrays.hashCode(childrens);
        return result;
    }
    @Override
    protected void finalize() {
        System.out.println("Удаляемый объектв классе Family в методе finalize(): " + this);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(childrens) +
                ", pet=" + pet +
                '}';
    }
}
