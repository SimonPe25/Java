package homework4;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] childrens;
    private Pet pet;

    public Family(Human mother, Human father, Human[] childrens) {
        this.mother = mother;
        this.father = father;
        this.childrens = childrens;
    }

    public void addChildren(Human children){
        Human[] humans = Arrays.copyOf(childrens, childrens.length + 1);
        children.setFamily(this);
        humans[childrens.length] = children;
        childrens = humans;


    }
    public  boolean deleteChild (int index){
        if (index < 0 || index >= childrens.length) {
            return false;
        }
        Human[] humans = new Human[childrens.length-1];
        System.arraycopy(childrens, 0, humans, 0, index);
        System.arraycopy(childrens, index + 1, humans, index, childrens.length - index-1);
        childrens = humans;
        return true;
    }

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

    public Human[] getChildrens() {
        return childrens;
    }

    public void setChildrens(Human[] childrens) {
        this.childrens = childrens;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
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
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(childrens) +
                ", pet=" + pet +
                '}';
    }
}
