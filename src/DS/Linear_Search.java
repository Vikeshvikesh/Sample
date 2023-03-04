package DS;

public class Linear_Search {
    public static void main(String[] args) {
        int[] a = {1, 2, 151, 515, 15, 6, 76, 54};
        int key = 6;
        for (int i=0;i<a.length;i++){
            if (i==key){
                System.out.println(i);
            }
        }
    }
}
