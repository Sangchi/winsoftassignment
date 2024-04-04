/*Q4:Write a Java Program to find the duplicate characters in a string. */
package question4;
import java.util.HashMap;
import java.util.Map;

public class printduplicates {
    

    public static void findDuplicates(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Increment the frequency count of the character in the HashMap
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters with frequency greater than 1 (indicating duplicates)
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Hello World";
        findDuplicates(inputString);
    
}

    
}
