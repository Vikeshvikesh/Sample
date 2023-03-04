package DS;

public class Binary_Search {
    public static void binarySearch(int arr[],int l,int h,int key){
    int mid=l+h/2;
    while (l<=h){
        if(arr[mid]<key){
            l=mid+1;
        } else if (arr[mid]==key) {
            System.out.println(mid);
            break;
        }
        else {
            h=mid-1;
        }
        mid=l+h/2;
    }
    if (l>h){
        System.out.println("element not found");
    }
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,4,6,4,6};
        int key=3;
        int h=arr.length-1;
        binarySearch(arr,0,h,key);
    }
}
