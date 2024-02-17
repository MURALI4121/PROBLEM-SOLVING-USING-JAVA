package H_STRINGS;

import java.util.Scanner;

class RemovingPunctuations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a String with punctuations");
        String str = scanner.nextLine();

        String wopn = removePunctuation(str);

        System.out.println(" the given String with punctuation " + str);
        System.out.println(" the given String without punctuation " + wopn);

    }

    public static String removePunctuation(String str){

        return str.replaceAll("[\\p{Punct}]", " ");
    }

}
