package Monday;

public class Amstrong {

    public static void main(String[] args) {
        int num=153; int temp=0; int r,sum=0;
        temp=num;

        while (num>0){
            r=num%10;
             sum=sum+r*r*r;
             num=num/10;
        }
        if (sum==temp){
            System.out.println("Armstrong");
        }else {
            System.out.println("not Armstrong");
        }
    }
}
