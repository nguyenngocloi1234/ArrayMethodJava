import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {10,5,4,11,16,68,72,8,0,0};
        Scanner scanner = new Scanner(System.in);
        int x;
        int index;
        do{
            System.out.println("Enter X: ");
            x = scanner.nextInt();
            System.out.println("Enter index of X: ");
            index = scanner.nextInt();
            if(index<0 || index > array.length-1 ){
                System.out.println(" Do not insert element to array!");
            }
        }
        while(index<0 || index>array.length-1);

        // chen x
        for(int i=array.length-1;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=x;
        System.out.println("Array after insert element: ");
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
//test

    }
}
