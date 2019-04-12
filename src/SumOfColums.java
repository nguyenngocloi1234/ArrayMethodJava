import java.util.Scanner;

public class SumOfColums {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a index of column: ");
        int col = scanner.nextInt();
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum =sum+ matrix[i][col];
        }
        System.out.println("Sum of colums "+col+": "+sum);
    }
}
