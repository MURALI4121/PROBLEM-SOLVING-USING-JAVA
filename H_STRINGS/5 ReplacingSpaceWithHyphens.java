package H_STRINGS;

import java.util.Scanner;

class ReplacingSpaceWithHyphens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String with Spaces");
        String string = scanner.nextLine();

        String newStr = spaceWithHyphen(string);

        System.out.println("After replacing spaces with hyphens \n" + newStr);


    }

    public static String spaceWithHyphen(String string) {

        String newStr = string.replace(' ', '-');

        return newStr;
    }
}
