import java.util.*;

public class nonrepeating {
    public static void NonRepeating(String str) {
        int freq[] = new int[26]; // For tracking frequency of characters
        Queue<Character> q = new LinkedList<>(); // Corrected LinkedList<> spelling

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            // Remove characters from queue that have frequency more than 1
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // Output the non-repeating character or indicate none exists
            if (q.isEmpty()) {
                System.out.println("No non-repeating character");
            } else {
                System.out.println("Non-repeating character is " + q.peek());
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        NonRepeating(str); // Call the method with the input string
    }
}
