package StringsPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LogestSubString {
    public static void main(String args[]){
        String s = "abcabcbc";
        int left[] = new int[]{0};
        Set<Character> set = new HashSet<>();

        String subString = s.chars()
                .mapToObj(c -> (char) c) // Convert ASCII value to character
                .filter(c -> {
                    while (set.contains(c)) {
                        set.remove(s.charAt(left[0]++)); // Adjust the left pointer
                    }
                    return set.add(c); // Add the character if it's not in the set
                })
                .map(String::valueOf) // Convert each character to String
                .collect(Collectors.joining()); // Join characters to form a string

        int maxLength = subString.length();
        System.out.println("Longest Substring Without Repeating Characters: " + subString);
        System.out.println("Length: " + maxLength);
    }
}
