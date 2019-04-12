import java.util.Scanner;

public class MaxValueMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix.length: ");
        int height = scanner.nextInt();
        System.out.println("Enter matrix[0].length: ");
        int width = scanner.nextInt();

        int[][] matrix = new int[height][width];
        System.out.println("Enter "+matrix.length+" rows and "+matrix[0].length+" columns: ");
        for(int i =0;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                matrix[i][j]= scanner.nextInt();
            }
        }


        // maxvalue
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                    maxCol =j;
                    maxRow =i;
                    System.out.println("MaxValueMatrix: "+max);
                }
            }
        }
        System.out.println("maxRow: "+maxRow);
        System.out.println("maxCol: "+maxCol);

    }
}
