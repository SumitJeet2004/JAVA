public class binary {
    public static void printBinaryString(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Create a copy of str to append "0" and call recursively
        StringBuilder str0 = new StringBuilder(str).append("0");
        printBinaryString(n - 1, 0, str0);

        // If lastPlace is 0, create a copy of str to append "1" and call recursively
        if (lastPlace == 0) {
            StringBuilder str1 = new StringBuilder(str).append("1");
            printBinaryString(n - 1, 1, str1);
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, 0, new StringBuilder());
    }
}
