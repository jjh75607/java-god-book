package vo1.chapter14;

public class ThrowSample {

    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try {
            sample.throwsException(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
            }

            System.out.println("number is " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception{
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12");
            }

            System.out.println("number is " + number);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
