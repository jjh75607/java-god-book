package vo1;

public class ReferenceStatic {

    static String name = "name";

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("This is a static Method.");
    }

    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
}
