import java.util.Scanner;
public class ans4 {
    public static void main(String[] args) {
        System.out.println(" enter the matrix size in the form of i and j like  i*j");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] matrix=new int[row][col];
        System.out.println("enter the element of each row and column one by one ");
        for(int i=0;i<row;i++){
             for(int j=0;j<col;j++){
                  matrix [i][j]=sc.nextInt();
             }
        }
        System.out.println(" the array is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }


    }
}
