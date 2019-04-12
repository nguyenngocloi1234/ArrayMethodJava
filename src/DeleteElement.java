import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = scanner.nextInt();
        int indexDel=0;
        boolean isExist =false;
        for(int i=0;i< array.length;i++){
            if(array[i]==x){
                indexDel =i;
                System.out.println("indexDel: "+indexDel);
                isExist =true;
            }
        }
        if(!isExist) System.out.println("X is not exist in the array!");
        else{
            for(int i = indexDel;i<array.length-1;i++){
                array[i]=array[i+1];
            }
            array[array.length-1]=0;
            System.out.println("Array 1: ");
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+"\t");
            }

        }



    }
}
