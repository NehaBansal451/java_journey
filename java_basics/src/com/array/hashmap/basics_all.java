package com.array.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class basics_all {
    public static void main(String[] args) {
        ////************* HAshmap
        //Duplicate keys are forbidden; duplicate values are allowed.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("neha", 20);
        map.put("kiran", 15);
        System.out.println(map.get("neha"));
        System.out.println(map.getOrDefault("rahul",30));
        System.out.println(map.containsKey("neha"));


        ///////////////******************* Hashset
        //Duplicate elements are completely forbidden
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(52);
        set.add(4);
        set.add(56);
        System.out.println(set);
    }
}
