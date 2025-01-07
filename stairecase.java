public class stairecase {
    
    public static boolean staircaseSearch(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        
        // Traverse the matrix
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found the key at (" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }
        
        // If the loop completes without finding the key
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 100; 
        staircaseSearch(matrix, key);
    }
}
