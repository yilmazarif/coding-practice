package StringProblems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique1("asda"));
        System.out.println(isUnique2("asda"));
        System.out.println(isUnique3("asda"));

        System.out.println(isUnique1("asd"));
        System.out.println(isUnique2("asd"));
        System.out.println(isUnique3("asd"));
    }

    /**
     * 1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
     */
    public static boolean isUnique1(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (charSet.contains(c)) {
                return false;
            } else {
                charSet.add(c);
            }
        }
        return true;
    }

    public static boolean isUnique2(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isUnique3(String s) {
        List<Integer> sortedChars = s.chars().sorted().boxed().collect(Collectors.toList());
        for(int i = 0; i < sortedChars.size() - 1; i++) {
            if(sortedChars.get(i).equals(sortedChars.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

}
