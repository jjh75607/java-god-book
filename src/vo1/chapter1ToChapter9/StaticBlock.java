package vo1.chapter1ToChapter9;

public class StaticBlock {

    static int data = 1;

    public StaticBlock() {
    }

    static {
        System.out.println("*** First static block. ***");
        data = 3;
    }

    static {
        System.out.println("*** Second static block. ***");
        data = 5;
    }

    public static int getData() {
        return data;
    }

}
