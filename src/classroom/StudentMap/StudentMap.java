package classroom.StudentMap;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("范高健", 100);
        map.put("林址浩", 90);
        map.put("周哲鹏", 80);
        map.put("韩文定", 70);
        map.put("徐健峰", 60);
        System.out.println(map);
        map.put("徐健峰", 70);
        System.out.println(map);
    }
}
