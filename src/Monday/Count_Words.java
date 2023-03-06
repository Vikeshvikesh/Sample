package Monday;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        System.out.println("enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for (int i=1; i<s.length()-1; i++){
            if ((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
