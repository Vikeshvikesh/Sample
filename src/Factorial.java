public class Factorial {
    static double getFactorial(int num){
        if(num>0){
            double f=1;
            for (int i=2; i<=num; i++){
                f=f*i;
            }
            return f;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(10));
    }
}
