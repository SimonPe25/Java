package homework11;

import org.junit.jupiter.api.Test;

import static homework7.Human.countFamily;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {
    @Test
    void getCountFamily() {
        Human mather = new Human("Olga", "Smirnova", 25);
        Human father = new Human("Nikolay", "Smirnov", 29);
       assertEquals(2, countFamily);
    }
}