public class compress {
    public static String compression(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count; // Changed count.toString() to directly append count
            }
        }
        return newstr; // Changed from printing to returning the result
    }

    public static void main(String[] args) {
        String str = "aaabbccccdd";
        System.out.println(compression(str)); // Corrected to print the return value
    }
}
