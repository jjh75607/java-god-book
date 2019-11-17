package vo1.chapter14;

public class CustomException {

    public static void main(String[] args) {
        CustomException sample = new CustomException();

        try {
            sample.throwMyException(13);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public void throwMyException(int number) throws MyException {
        try {
            if (number > 12) {
                throw new MyException("over");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
