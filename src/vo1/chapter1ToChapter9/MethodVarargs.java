package vo1.chapter1ToChapter9;

public class MethodVarargs {

    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();

        varargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4, 5});
        varargs.calculateNumbers(1, 2, 3, 4, 5);
    }

    public void calculateNumbersWithArray(int[] array) {
    }

    public void calculateNumbers(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            total += n;
        }

        System.out.println(total);
    }
}
