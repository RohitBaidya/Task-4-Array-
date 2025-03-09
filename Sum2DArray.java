import java.util.Scanner; // Importing Scanner class

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declaring a 2D array
        int[][] array = new int[rows][cols];

        // Variable to store the sum of all elements
        int sum = 0;

        // Taking user input for the elements of the array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
                sum += array[i][j]; // Adding each element to sum
            }
        }

        // Printing the sum of all elements
        System.out.println("The sum of all elements in the 2D array is: " + sum);

        scanner.close();
    }
}

