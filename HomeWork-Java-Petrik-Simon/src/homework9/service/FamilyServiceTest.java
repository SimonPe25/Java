package homework9.service;

import homework9.Family;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FamilyServiceTest {
    @Test
    void getAllFamilies() {
        List<Family> list = new ArrayList<>();
        Family test = new Family(null, null);
        list.add(test);
        System.out.println("List family : " + list);
    }}

