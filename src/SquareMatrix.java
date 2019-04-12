public class SquareMatrix {
    public static void main(String[] args) {
        double[][] matrix ={{1.0,2.0,3.0},{2.0,3.0,4.0},{4.0,5.0,6.0}
        };
        double sum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j) sum = sum+ matrix[i][j];
            }
        }
        System.out.println("Sum = "+sum);
    }
}
