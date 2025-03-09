import java.util.Scanner; // Import Scanner class for user input

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declaring a 2D array
        int[][] matrix = new int[rows][cols];

        // Taking user input for the elements of the matrix
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the 2D array in spiral order
        System.out.println("Spiral Order Output:");
        printSpiral(matrix, rows, cols);

        scanner.close();
    }

    // Method to print matrix in spiral order
    public static void printSpiral(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move the top boundary down

            // Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move the right boundary left

            // Print bottom row (right to left), if there are remaining rows
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up
            }

            // Print left column (bottom to top), if there are remaining columns
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move the left boundary right
            }
        }
    }
}

