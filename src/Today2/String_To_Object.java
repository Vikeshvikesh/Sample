package Today2;

public class String_To_Object {
    public static void main(String[] args)
    {
        String str = "BeginnersBook";
        Object obj = str;
        System.out.println(obj.getClass().getName());

        System.out.println("The value contained in obj is : "+obj);
    }
}
