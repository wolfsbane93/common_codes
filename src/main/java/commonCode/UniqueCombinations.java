package commonCode.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueCombinations {

    // Method to generate all unique combinations
    static void generateCombinations(String str, String current, int index, Set<String> result) {
        // Add the current combination to the result set (Set automatically handles duplicates)
        if (!current.isEmpty()) {
            result.add(current);
        }
        
        // Generate combinations by picking characters starting from 'index'
        for (int i = index; i < str.length(); i++) {
            // Add character str[i] to current and recurse for the remaining characters
            generateCombinations(str, current + str.charAt(i), i + 1, result);
        }
    }

    public static void main(String[] args) {
        String word = "abc";
        Set<String> result = new HashSet<>();
        
        // Generate all combinations
        generateCombinations(word, "", 0, result);

        // Print all unique combinations
        System.out.println("Unique combinations of characters from the word '" + word + "':");
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}
