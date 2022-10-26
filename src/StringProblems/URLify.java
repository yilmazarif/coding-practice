package StringProblems;

public class URLify {

    public static void main(String[] args) {
        String result = urlify("Mr John Smith    ");
        System.out.println(result);
    }

    /**
     * 1.3 URLify: Write a method to replace all spaces in a string with '%20:
     * You may assume that the string has sufficient space at the end to hold the additional characters,
     * and that you are given the "true" length of the string.
     * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
     * "asd asd dasdas   ", 14
     */

    public static String urlify(String input) {
        char[] chars = input.toCharArray();
        boolean firstCharEncountered = false;
        int j = chars.length - 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                if (!firstCharEncountered) {
                    firstCharEncountered = true;
                }
                chars[j] = chars[i];
                j--;
            } else if (chars[i] == ' ' && firstCharEncountered) {
                chars[j] = '0';
                chars[j - 1] = '2';
                chars[j - 2] = '%';
                j = j - 3;
            }
        }
        return new String(chars);
    }
}
