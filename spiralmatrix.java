public class spiralmatrix {

    public static void printSpiral(int matrix[][]) {
        // Check if the matrix is empty
        if (matrix.length == 0) {
            System.out.println("The matrix is empty.");
            return;
        }
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse Right (Top row)
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // Traverse Down (Right column)
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            // Check if rowStart and rowEnd are valid after increment/decrement
            if (rowStart <= rowEnd) {
                // Traverse Left (Bottom row)
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            // Check if colStart and colEnd are valid after increment/decrement
            if (colStart <= colEnd) {
                // Traverse Up (Left column)
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }

    public static void main(String[] args) {
        // Valid matrix with equal length rows
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        // Testing the printSpiral method
        printSpiral(matrix);
    }
}
