package StringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(checkPermutation("arif", "yilmaz"));
        System.out.println(checkPermutation("arif yilmaz", "yilmaz arif"));
        System.out.println(checkPermutation("arif yilmaz", "yila mazrif"));
    }

    /**
    * 1.2 Given two strings, write a method to decide if one is a permutation of the other.
    * */
    public static boolean checkPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            Character c = s1.charAt(i);
            Integer val = map.getOrDefault(c, 0);
            map.put(c, val + 1);
        }

        for(int i = 0; i < s2.length(); i++){
            Character c = s2.charAt(i);
            Integer val = map.getOrDefault(c, 0);
            if(val == 0) {
                return false;
            }
            map.put(c, val - 1);
        }
        List<Integer> values = new ArrayList<>(map.values());

        for (Integer value : values) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }



}
