package Package2;

public class ArraysTask5 {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5]; //int[][] matrix = new int[6][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <=1; j++) {
                matrix[i][j] = j + 1;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                matrix[i][j] = i + 1;
            }
        }
        printArray(matrix);
    }

    static void fillDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = i + 1;
                }
            }
        }
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }

            System.out.print("\n");
        }
    }
}