import java.util.Scanner;
public class CountNumberStudentPass {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        // nhap size
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size>30)
                System.out.println("Size should not exceed 30 ");
        }
        while (size>30);

        // nhap mang
        int[] array = new int[size];
        for(int i=0; i<array.length;i++){
            System.out.println("Enter a mark of student "+(i+1)+":");
            array[i]=scanner.nextInt();
        }

        // In ra danh sach mang, dem so luong sv dau
        int count =0;
        System.out.println("List of mark: ");
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+"\t");
            if(array[i]>=5 && array[i]<=10)
                count++;
        }
        System.out.println();
        System.out.println("The number of students passing the exam is: "+count);

    }
}
