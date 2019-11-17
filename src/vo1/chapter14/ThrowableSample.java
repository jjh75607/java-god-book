package vo1.chapter14;

public class ThrowableSample {

    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    public void throwable() {
        int[] ints = new int[5];

        try {
            ints = null;
            System.out.println(ints[5]);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
        }
    }
}
