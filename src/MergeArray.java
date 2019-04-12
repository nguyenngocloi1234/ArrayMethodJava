import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        //arr1
        System.out.println("Array 1: ");
        for(int i=0;i<array1.length;i++){
           array1[i]= scanner.nextInt();
        }

        //arr2
        System.out.println("Array 2: ");
        for (int i=0;i<array2.length;i++){
            array2[i]= scanner.nextInt();
        }

        // arr3
        int[] array3 = new int [array1.length+array2.length];
        for(int i=0; i<array1.length;i++){
            array3[i]=array1[i];
        }
        int j=0;
        for(int i=array1.length;i<array3.length;i++){
            array3[i] = array2[j];
            j++;
        }
        System.out.println("Array3: ");
        for(int i=0; i<array3.length; i++){
            System.out.print(array3[i]+"\t");
        }
    }
}
