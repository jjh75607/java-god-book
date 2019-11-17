package vo1.chapter14;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBoundsTryCatch();
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];

        System.out.println(intArray[5]);
    }

    public void arrayOutOfBoundsTryCatch() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
            System.out.println("This code should run");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

        System.out.println("This code must run");
    }
}
