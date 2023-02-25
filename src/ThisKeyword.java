public class ThisKeyword {
    int x = 10;
    static int y = 20;

    public void instanceMethod() {
        String x = "string x";
        String y = "string y";
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public static void staticMethod() {
        String y = "string";
        System.out.println(ThisKeyword.y);
    }

    public static void main(String[] args) {
        ThisKeyword s = new ThisKeyword();
        s.instanceMethod();
        staticMethod();
    }
}