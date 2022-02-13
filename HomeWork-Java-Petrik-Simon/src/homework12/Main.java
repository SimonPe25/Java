package homework12;
import homework12.controller.FamilyController;
import homework12.dao.CollectionFamily;
import homework12.service.FamilyService;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws ParseException, IOException {

          List<Family> family = new ArrayList<>();
          CollectionFamily collectionFamily = new CollectionFamily(family);
          FamilyService familyService = new FamilyService(collectionFamily);
          FamilyController familyController = new FamilyController(familyService);


        startProgramm();
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.println("Hello my friend " + name + " please choose your number");

        while (true) {
            System.out.println("Please enter number only");
            int num = Integer.parseInt(in.nextLine());
            try {
                if (num == 1){
                   StartList start = new StartList();
                   start.startList();
                }
                if (num==2){
                   familyController.getFamilywithIndex();
                }
                if (num ==3){
                    System.out.println("Please enter number for get family with people bigger then your number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.getFamiliesBiggerThan(getFam,number);
                }
                if (num ==4){
                    System.out.println("Please enter number for get family with people less then your number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.getFamiliesLessThan(getFam,number);
                }
                if (num ==4){
                    System.out.println("Please enter number for get family with people less then your number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.getFamiliesLessThan(getFam,number);
                }
                if (num ==5){
                    System.out.println("Please enter number for get family with people equals number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.countFamiliesWithMemberNumber(getFam, number);
                }
                if (num == 6){
                    System.out.println("Create new family");
                    System.out.println("Please name mather");
                    String matherName = in.nextLine();
                    System.out.println("Please sureName mather");
                    String sureName = in.nextLine();
                    System.out.println("Please yearBirth mather");
                    String yearBirth = in.nextLine();
                    System.out.println("Please monthBirth mather");
                    String monthBirth = in.nextLine();
                    System.out.println("Please dayBirth mather");
                    String dayBirth = in.nextLine();
                    System.out.println("Please iq mather");
                    int iq = Integer.parseInt(in.nextLine());

                    System.out.println("Create new person father");
                    System.out.println("Please name father");
                    String fatherName = in.nextLine();
                    System.out.println("Please sureName father");
                    String fatherSureName = in.nextLine();
                    System.out.println("Please yearBirth father");
                    String yearBirthFather= in.nextLine();
                    System.out.println("Please monthBirth father");
                    String monthBirthFather= in.nextLine();
                    System.out.println("Please dayBirth father");
                    String dayBirthFather= in.nextLine();
                    System.out.println("Please iq father");
                    int fatherIq = Integer.parseInt(in.nextLine());
                    String birthMather = dayBirth+"/"+monthBirth+"/"+yearBirth;
                    String birthFather = dayBirthFather+"/"+monthBirthFather+"/"+yearBirthFather;
                    Human person1 = new Human(matherName,sureName,birthMather,iq);
                    Human person2 = new Human(fatherName,fatherSureName, birthFather,fatherIq);
                    familyController.createNewFamily(person1, person2);
                }
                if (num ==7){
                    familyController.getFamilywithIndex();
                    System.out.println("Please enter number of index for delete family equals number");
                    int number = Integer.parseInt(in.nextLine());
                    List<Family> getFam = familyController.getFamilyList();
                    familyController.deleteFamilyByIndex(number-1);
                    familyController.getFamilywithIndex();
                }
                if (num ==8){
                    familyController.getFamilywithIndex();
                    System.out.println("Редактировать семью по индексу семьи в общем списке \n" +
                            "  - 1. Родить ребенка\n" +
                            "    - запросить порядковый номер семьи (ID)\n" +
                            "    - запросить необходимые данные (какое имя дать мальчику, какое девочке)\n" +
                            "  - 2. Усыновить ребенка\n" +
                            "    - запросить порядковый номер семьи (ID)\n" +
                            "    - запросить необходимые данные (ФИО, год рождения, интеллект)\n" +
                            "  - 3. Вернуться в главное меню  \n");
                    System.out.println("Выберите подпункт меню, вводите только цифры");
                    int number = Integer.parseInt(in.nextLine());
                    if (number >3 ){
                        System.out.println("Введите число меньше 3");
                    }
                    if (number==1){
                        System.out.println("Введите ID");
                        int id = Integer.parseInt(in.nextLine());
                        System.out.println("Введите имя Мальчика");
                        String idBoy = in.nextLine();
                        System.out.println("Введите имя Девочки");
                        String idGirl = in.nextLine();
                        familyController.bornChildUseID(id, idBoy, idGirl);
                    }
                    if (number==2){
                        System.out.println("Введите ID");
                        int iD = Integer.parseInt(in.nextLine());
                        System.out.println("Введите ФИО");
                        String nameChild = in.nextLine();
                        System.out.println("Введите год рождения");
                        String birthDate = in.nextLine();
                        System.out.println("Введите интелект");
                        int iq = Integer.parseInt(in.nextLine());
                        familyController.adobeNewChild(iD, nameChild,birthDate, iq );
                       // familyController.getFamilywithIndex();
                    }
                    if (number==3){
                        System.out.println("Выберите категорию из основного меню");
                    }
                }
                if (num ==9){
                    System.out.println("Удалить всех детей старше возраста");
                    System.out.println("Введите возраст старше которого нужно удалить");
                    int age = Integer.parseInt(in.nextLine());
                    familyController.deleteAllChildrenOlderThen(age);
                    familyController.getFamilywithIndex();
                }
                if (num ==10){
                    System.out.println("Запись данных в файл");
                    familyController.writeFile();
                }
                if (num ==11){
                    System.out.println("Считывание данных...");
                    familyController.loadData();
                }
            } catch (NumberFormatException e) {
                System.err.println("\n" + "Wrong string format!");
                System.out.println(num + " please, try again only numbers.");
            }
        }
    }
    public static void startProgramm(){
        ComandList comandList = new ComandList();
        comandList.start();
    }
}

