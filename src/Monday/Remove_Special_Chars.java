package Monday;

public class Remove_Special_Chars {
    public static void main(String[] args) {

        String s="%@ hi to java &$";

        s=s.replaceAll("[^a-zA-Z0-9]"," ");
        System.out.println(s);
    }
}
