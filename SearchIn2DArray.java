import java.util.Scanner; // Import Scanner class for user input

public class SearchIn2DArray {
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

        // Taking user input for the number to be searched
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Searching for the target in the 2D array
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == target) {
                    System.out.println("Number " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        // If the number is not found
        if (!found) {
            System.out.println("Number " + target + " not found in the 2D array.");
        }

        scanner.close();
    }
}
