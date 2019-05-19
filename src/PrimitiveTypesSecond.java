public class PrimitiveTypesSecond {

    int intDefault1;
    byte byteDefault;
    short shortDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    char charDefault;
    boolean booleanDefault;

    public static void main(String[] args) {
        PrimitiveTypesSecond second = new PrimitiveTypesSecond();
        second.defaultValues();
    }

    public void defaultValues() {
        System.out.println(byteDefault);
        System.out.println(shortDefault);
        System.out.println(intDefault1);
        System.out.println(longDefault);
        System.out.println(floatDefault);
        System.out.println(doubleDefault);
        System.out.println(charDefault);
        System.out.println(booleanDefault);
    }

}
