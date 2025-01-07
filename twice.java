public class twice {
    public static int checknum(int num[]) {
        // Iterate through each element in the array
        for (int i = 0; i < num.length; i++) {
            // Compare the current element with every other element
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return 1; // Duplicate found
                }
            }
        }

        // No duplicates found
        return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 7, 3, 65, 4};

        // Check for duplicates and print the result
        System.out.println(checknum(nums)); // Output should be 1, as 4 is duplicated
    }
}
