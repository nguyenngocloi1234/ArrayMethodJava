public class MinValue {


    public static int minValue(int []array){
        int min =array[0];
        int index =0;
        for(int i=1;i<array.length;i++){
            if(array[i] < min) {
                min = array[i];
                index =i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {8,5,1,9,0,14,17,89};
        int index = minValue(arr);
        System.out.println("The smallest element in array list is: " + arr[index]);
    }

}
