package homework4;

import static homework4.Human.countFamily;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("dog", "Charley", 8, 30, new String[]{"run", "jump", "eat"});
        Pet getSpeciesNickname = new Pet("dog", "Charley");
        String[][] schedule = {{"monday", "wednesday", "friday"}, {"Java consultation", "React consultation", "JavaScript consultation"}};
        String[][] scheduleFather = {{"tuesday", "thursday", "saturday"}, {"Sport", "work", "Go for a walk"}};
        String[][] scheduleArina = {{"wednesday", "sunday"}, {"Go for a walk", "React consultation"}};

        Human mother = new Human("Olga", "Averina", 25);
        Human father  = new Human("Konstantin", "Averin", 26);
        Human sister = new Human("Arina", "Averina", 18,98);
        Human brother = new Human("Dina", "Averina", 25, 95);
        Human elderSister = new Human("Olya", "Averina", 30, 98);
        Human elderBrother = new Human("Victor", "Averin", 31);

        mother.setSchedule(schedule);
        father.setSchedule(scheduleFather);
        sister.setSchedule(schedule);
        brother.setSchedule(scheduleFather);

        Family family = new Family(mother, father, new Human[]{sister});
        family.setPet(pet);
        family.addChildren(brother);
        family.deleteChild(2);
        System.out.println("***");
        System.out.println("new Famaly " +  family);
        pet.eat();
        pet.respond();
        pet.foul();
        System.out.println("***");
        System.out.println(pet);
        System.out.println(getSpeciesNickname.getSpecies() + " " + getSpeciesNickname.getNickname());
        System.out.println("***");
        System.out.println("Количество человек в семье: " + countFamily);

    }

}
