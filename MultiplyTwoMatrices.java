import java.util.Scanner; // Import Scanner class for user input

public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for matrix dimensions
        System.out.print("Enter the number of rows for first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for first matrix (same as rows of second matrix): ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter the number of columns for second matrix: ");
        int cols2 = scanner.nextInt();

        // Declaring matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols1][cols2]; // The number of rows in matrix2 must be equal to cols1
        int[][] resultMatrix = new int[rows1][cols2]; // Result matrix has dimensions rows1 x cols2

        // Taking user input for the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Taking user input for the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < cols1; i++) { // Rows of second matrix = cols of first matrix
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiplying the two matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                resultMatrix[i][j] = 0; // Initialize result matrix cell to 0
                for (int k = 0; k < cols1; k++) { // k iterates over cols of matrix1 and rows of matrix2
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j]; // Multiply and sum
                }
            }
        }

        // Printing the resultant matrix
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
