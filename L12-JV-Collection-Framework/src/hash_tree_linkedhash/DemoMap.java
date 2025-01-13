package hash_tree_linkedhash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Thomas",30);
        hashMap.put("John", 28);
        hashMap.put("George", 33);
        hashMap.put("Paul", 24);

        System.out.println("Map: " + hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Tree Map: " + treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Thomas", 30);
        linkedHashMap.put("John", 28);
        linkedHashMap.put("George", 33);
        linkedHashMap.put("Paul", 24);
        System.out.println("The age for " + "Thomas is" + linkedHashMap.get("Thomas"));
    }
}
