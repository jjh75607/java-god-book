package vo1;

public class OperatorUnary {

    public static void main(String[] args) {

        OperatorUnary operator = new OperatorUnary();
        operator.unary();

    }

    public void unary() {
        int intValue = -10;
        int result = +intValue;
        System.out.println(result);

        result = -10;
        System.out.println(result);
    }
}
