import java.util.Scanner; // Import Scanner class for user input

public class FindMinMax2DArray {
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

        // Initializing min and max with the first element of the array
        int min = array[0][0];
        int max = array[0][0];

        // Finding the smallest and largest element in the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] < min) {
                    min = array[i][j]; // Update min if a smaller element is found
                }
                if (array[i][j] > max) {
                    max = array[i][j]; // Update max if a larger element is found
                }
            }
        }

        // Printing the smallest and largest elements
        System.out.println("The smallest element in the 2D array is: " + min);
        System.out.println("The largest element in the 2D array is: " + max);

        scanner.close();
    }
}

