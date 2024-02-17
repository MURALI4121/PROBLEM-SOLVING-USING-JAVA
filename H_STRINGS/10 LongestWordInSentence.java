package H_STRINGS;

import java.util.Scanner;

class LongestWordInSentence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

        System.out.println("the longest word in a sentence is " + LongestWordFinder(sentence));
    }

    public static String LongestWordFinder(String sentence){

        //Split the sentence into words
        String[] words = sentence.split("\\s+");

        //Initialize variables to keep track of the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        //Iterate through the words
        for(int i = 0; i < words.length; i++){
           if(words[i].length() > maxLength){
               maxLength = words[i].length();
               longestWord = words[i];
           }
        }
       return longestWord;
    }
}
