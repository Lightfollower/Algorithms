package lesson_8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        ChainingHashMap<Integer ,String> map = new ChainingHashMap<>();
//        map.put(1,"one");
//        map.put(2,"two");
//        map.put(12,"twelve");
//        map.put(15,"fifteen");
//
//        System.out.println(map.get(155));
//        System.out.println(map);
//        System.out.println(map.get(12));
//
//        map.delete(12);
//        System.out.println(map.get(12));
//        System.out.println(map);
//        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            map.put(random.nextInt(1000),"");
//        }
//        System.out.println(map);

        LinearProbingHashMap<Integer,String> map1 = new LinearProbingHashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(12,"twelve");
        map1.put(15,"fifteen");
        map1.put(7,"seven");
        map1.put(8,"eight");

        System.out.println(map1.get(1));
//        map1.put(1,"1");
//        System.out.println(map1.get(1));
        map1.delete(15);
        map1.put(17,"seventeen");

        System.out.println(map1);

    }
}
