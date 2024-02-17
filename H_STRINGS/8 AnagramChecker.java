package H_STRINGS;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second String : ");
        String string2 = scanner.nextLine();

        if (isAnagram(string1, string2)) {
            System.out.println(string1 + " " + string2 + " are anagrams");
        } else {
            System.out.println(string1 + " " + string2 + " are not anagrams");
        }
    }

    public static boolean isAnagram(String str1, String str2) {

        //Normalize strings : remove spaces and convert to lower case
        String normalizedStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String normalizedStr2 = str2.replaceAll("\\s", "").toLowerCase();

        //Check if lengths are equal
        if (normalizedStr1.length() != normalizedStr2.length()) {
            return false;
        }

        //Convert strings to char arrays
        char[] charArray1 = normalizedStr1.toCharArray();
        char[] charArray2 = normalizedStr2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //Check if sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);

    }
}
