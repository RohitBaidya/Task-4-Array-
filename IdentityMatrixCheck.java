import java.util.Scanner;

public class IdentityMatrixCheck {
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

        // Check if the matrix is an identity matrix
        if (isIdentityMatrix(matrix, n)) {
            System.out.println("The given matrix is an Identity Matrix.");
        } else {
            System.out.println("The given matrix is NOT an Identity Matrix.");
        }

        scanner.close();
    }

    // Function to check if the matrix is an identity matrix
    public static boolean isIdentityMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check diagonal elements (should be 1)
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }
                // Check non-diagonal elements (should be 0)
                else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
