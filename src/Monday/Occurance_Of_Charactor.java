package Monday;

public class Occurance_Of_Charactor {
    public static void main(String[] args) {
        String s="java programming java oops";
        int a=s.length();
        s=s.replaceAll("a","");
        int b=s.length();
        int c=a-b;
        System.out.println(c);
    }
}
