/*Q3:Write a Java Program to count the number of words in a string using HashMap. */

package question2.question3;


import java.util.HashMap;

public class WordCount {
    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Split the string into words
        String[] words = str.split("\\s+");

        // Count the occurrence of each word
        for (String word : words) {
            word = word.toLowerCase(); // Convert word to lowercase for case-insensitive counting
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String inputString = "Hello world hello world how are you";
        HashMap<String, Integer> wordCountMap = countWords(inputString);

        // Print the word count
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
