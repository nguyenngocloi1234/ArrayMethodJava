public class CountCharInString {
    public static void main(String[] args) {
        String string = "nguyen ngoc loi";
        char c = 'n';
        int count =0;
        for(int i=0;i<string.length();i++){
                if(string.charAt(i)==c){
                    count++;
                }
        }
        System.out.println("count = "+count);
    }
}
