package Today1;

public class Total_Objects_In_Class {
     static int  count=0;

    public Total_Objects_In_Class() {
        count++;
    }

    public static void main(String[] args) {
        Total_Objects_In_Class a=new Total_Objects_In_Class();
        Total_Objects_In_Class b=new Total_Objects_In_Class();
        System.out.println(count);
    }

}
