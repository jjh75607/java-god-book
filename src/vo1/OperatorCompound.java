package vo1;

public class OperatorCompound {

    public static void main(String[] args) {

        OperatorCompound compound = new OperatorCompound();
        compound.compound();

    }

    public void compound() {
        int intValue = 10;

        intValue += 5;
        System.out.println(intValue);

        intValue -= 5;
        System.out.println(intValue);

        intValue *= 5;
        System.out.println(intValue);

        intValue /= 5;
        System.out.println(intValue);

        intValue %= 5;
        System.out.println(intValue);
    }
}
