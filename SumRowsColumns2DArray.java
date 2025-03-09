import java.util.Scanner; // Import Scanner class for user input

public class SumRowsColumns2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declaring a 2D array
        int[][] array = new int[rows][cols];

        // Taking user input for the elements of the array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Calculating and printing the sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j]; // Adding elements of the row
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        // Calculating and printing the sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += array[i][j]; // Adding elements of the column
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

        scanner.close();
    }
}
