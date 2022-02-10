package homework11;

import homework11.service.FamilyService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class ComandList {

    Map<Integer, String> listQuestion = new HashMap<>();

    public Map<Integer, String> getListQuestion() {
        return listQuestion;
    }

    public void setListQuestion(Map<Integer, String> listQuestion) {
        this.listQuestion = listQuestion;
    }

    public void start(){
        addList();
        for (int i = 1; i < listQuestion.size()+1; i++) {
            System.out.println(i+ " - " + listQuestion.get(i));
        }
        //logik();
    }
    public void logik(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.println("Hello my friend " + name + " please choose your number");

        int num = Integer.parseInt(in.nextLine());
        System.out.println("Let the game begin! Please enter");
        while (true) {
            String numberUser = in.nextLine();
            try {
                num = Integer.parseInt(numberUser);
                if (num == 4){
                    System.out.println("Ваш выбор номер " + num);

                }


            } catch (NumberFormatException e) {
                System.err.println("\n" + "Wrong string format!");
                System.out.println(num + " please, try again only numbers.");
            }
        }
    }
    public void One() {

    }

    public void addList(){
        listQuestion.put(1, "Заполнить тестовыми данными (автоматом создать несколько семей и сохранить их в базе)");
        listQuestion.put(2, "Отобразить весь список семей (отображает список всех семей с индексацией, начинающейся с 1)");
        listQuestion.put(3, "Отобразить список семей, где количество людей больше заданного\n" +
                "  - запросить интересующее число\n");
        listQuestion.put(4, "Отобразить список семей, где количество людей меньше заданного\n" +
                "  - запросить интересующее число\n");
        listQuestion.put(5, "Подсчитать количество семей, где количество членов равно\n" +
                "  - запросить интересующее число\n");
        listQuestion.put(6, "Создать новую семью\n" +
                "  - запросить имя матери\n" +
                "  - запросить фамилию матери\n" +
                "  - запросить год рождения матери\n" +
                "  - запросить месяц рождения матери\n" +
                "  - запросить день рождения матери\n" +
                "  - запросить iq матери\n" +
                "  \n" +
                "  - запросить имя отца\n" +
                "  - запросить фамилию отца\n" +
                "  - запросить год рождения отца\n" +
                "  - запросить месяц рождения отца\n" +
                "  - запросить день рождения отца\n" +
                "  - запросить iq отца\n");
        listQuestion.put(7, "Удалить семью по индексу семьи в общем списке\n" +
                "  - запросить порядковый номер семьи (ID)\n");
        listQuestion.put(8, "Редактировать семью по индексу семьи в общем списке \n" +
                "  - 1. Родить ребенка\n" +
                "    - запросить порядковый номер семьи (ID)\n" +
                "    - запросить необходимые данные (какое имя дать мальчику, какое девочке)\n" +
                "  - 2. Усыновить ребенка\n" +
                "    - запросить порядковый номер семьи (ID)\n" +
                "    - запросить необходимые данные (ФИО, год рождения, интеллект)\n" +
                "  - 3. Вернуться в главное меню\n");
        listQuestion.put(9, "Удалить всех детей старше возраста (во всех семьях удаляются дети старше указанного возраста - будем считать, что они выросли)\n" +
                "  - запросить интересующий возраст\n");
    }



    @Override
    public String toString() {
        return "ComandList{" +
                "listQuestion=" + listQuestion +
                '}';
    }



}
