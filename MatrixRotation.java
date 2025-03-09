import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter the size of the square matrix (N x N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotate the matrix by 90 degrees clockwise
        rotateMatrix(matrix, n);

        // Print the rotated matrix
        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
        
        scanner.close();
    }

    // Function to rotate the matrix in place
    public static void rotateMatrix(int[][] matrix, int n) {
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
