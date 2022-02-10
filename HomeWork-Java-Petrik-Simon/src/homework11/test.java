package homework11;

import java.util.*;

public class test {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println("Set - " + set);

        TreeMap <Integer, String> map = new TreeMap<>();
        map.put(2, "2");
        map.put(3, "3");
        map.put(1, "1");
        System.out.println("Treemap - " + map);

        //разменщение в обратном порядке
        TreeMap <Integer, String> map2 = new TreeMap<>((o1, o2) -> o2-o1);
        map2.put(2, "2");
        map2.put(3, "3");
        map2.put(1, "1");
        System.out.println("Treemap2 - " + map2);
        List<Integer> raw = new ArrayList<>();
        raw.add(3);
        raw.add(2);
       for (Object o : raw){
           Integer interval = (Integer) o;
           System.out.println(interval);
       }
        System.out.println(raw );



    }

}
