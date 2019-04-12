import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        // nhap va kiem tra kich thuoc mang
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>20)
                System.out.println(" The size is not exceed 20!");
        }
        while (size>20);

        //Nhap gia tri cho cac phan tu mang
        int[] array = new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter element" +(i+1)+":");
            array[i]= scanner.nextInt();
        }

        //in ra mang da nhap
        System.out.println("Array: ");
        for(int i=0;i<array.length;i++){

            System.out.print(array[i]+"\t");
        }
        System.out.println();

        //dao nguoc mang
        for(int i=0; i<array.length/2;i++){
            int temp = array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
        }

        //in mang sau khi dao nguoc
        System.out.println("Reverse array: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+"\t");


        }


    }
}
