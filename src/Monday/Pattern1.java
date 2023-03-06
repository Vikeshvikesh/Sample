package Monday;

public class Pattern1 {
    public static void main(String []args){
        int i,j,rows=5;
        for(i=1;i<=rows;i++){
            for(j=rows;j>=1;j--){
                if(j!=i)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
