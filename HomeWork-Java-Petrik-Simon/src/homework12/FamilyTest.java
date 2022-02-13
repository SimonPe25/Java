package homework12;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamilyTest {

    @Test
    void addChildren() throws ParseException {
        Family family = new Family(null,null, List.of(new Human[]{}));
        Human sister = new Human("Arina", "Averina", "23/07/2002",98);
        family.addChildren(sister);
        Human[] childrens = family.getChildrens(sister);
        assertEquals(1, childrens.length);
        System.out.println("Проверка прошла, массив увеличивается на 1 элемент а именно на " + Arrays.toString(family.getChildrens(sister)));
    }

    @Test
    void deleteChild() throws ParseException {
        Human sister = new Human("Arina", "Averina", "18/03/1987",98);
        Human brother = new Human("Anatoliy", "Averin", "24/09/2007", 95);
        Family family = new Family(null, null, List.of(new Human[]{sister, brother}));
        Human[] childrens = family.getChildrens(sister);

        //проверка то ребенок действительно удаляется из массива children  (если передать объект, еквивалентый хотябы одному элементу массива)
        int index = 1;

        if (index < 0 || index > childrens.length) {
            System.out.println("Проверка что массив не изменился если ввести не корректный индек");
            assertEquals(2, childrens.length);
            return;
        }
        if (index > 0 || index <= childrens.length) {
            System.out.println("Проверка что массив меняется");
            family.deleteChild(index);
            int child = (int) Arrays.stream(childrens).count();
            System.out.println("Int: " + child);
            Human[] newChild = family.getChildrens(sister);
            System.out.println("newChild: " + Arrays.toString(newChild));
            assertEquals(1, newChild.length);
        }
    }

    @Test
    void testToString() throws ParseException {
        Human mother = new Human("Olga", "Averina", "30/07/2004");
        assertEquals("Olga", mother.getName());
    }
}
