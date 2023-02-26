package Today;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,2,3,4,5};
        for (int i=0; i< a.length-1; i++){
            for (int j=i+1; i<a.length; i++){
                if (a[i]!=a[j+1]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
