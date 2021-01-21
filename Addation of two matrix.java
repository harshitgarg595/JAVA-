import java.util.Scanner;
public class ans4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number of rows ");
        int row = sc.nextInt();
        System.out.println(" enter number of columns ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int result [][] = new int[row][col];
        System.out.println("you hav to enter total " + 2*(row*col) +" elements ");
        System.out.println("enter the element of  matrix 1 ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(" matrix 1 is  ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("enter the element of matrix2  ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println(" matrix 2 is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println(" resulting sum of matrix is ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                result[i][j] = matrix[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println(" ");
        }


    }

}

