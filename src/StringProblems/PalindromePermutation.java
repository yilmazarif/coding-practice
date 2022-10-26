package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

    public static void main(String[] args) {
        boolean result = palindromePermutation("ariff iraxz");
        System.out.println(result);
    }

    /**
    * Given a string, write a function to check if it is a permutation of a palindrome.
     * A palindrome is a word or phrase that is the same forwards and backwards.
     * A permutation is a rearrangement of letters.
     * The palindrome does not need to be limited to just dictionary words.
    * */
    public static boolean palindromePermutation(String input) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            if(c != ' ') {
                Integer count = charCounts.getOrDefault(c, 0);
                charCounts.put(c, count + 1);
            }
        }
        boolean oddNumberOfOccurencesFound = false;
        for(Integer i : charCounts.values()) {
            if(i % 2 == 1) {
                if(!oddNumberOfOccurencesFound) {
                    oddNumberOfOccurencesFound = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
