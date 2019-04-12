import  java.util.Scanner;

public class MaximumArray {
    public static void main(String[] args) {

        // nhap va kiem tra kich thuoc mang
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>20)
                System.out.println("Size should not exceed 20");
        }
        while (size >20);

        //nhap gia tri cho phan tu mang
        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element: "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }

        // in ra danh sach tai san da nhap
        System.out.print("Property list: ");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+ "\t");
        }

        //Tim GTLN
        int max = array[0];
        int index =1;
        for(i=0;i<array.length;i++){
            if(array[i]> max){
                max = array[i];
                index = i+1;
            }
        }
        System.out.println("The largest property in the list is "+max+" at position "+index);
    }
}
