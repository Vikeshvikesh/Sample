package Today;

public class CountPunctuationInString {

    public static void main(String[] args) {
        int count=0;
        String str="hello, :wonder ;full ! world";
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
