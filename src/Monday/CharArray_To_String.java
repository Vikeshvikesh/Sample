package Monday;

public class CharArray_To_String {

    public static void main(String args[])
    {
        char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        String str = new String(ch);
        System.out.println(str);

        String str2 = String.valueOf(ch);
        System.out.println(str2);
    }
}
