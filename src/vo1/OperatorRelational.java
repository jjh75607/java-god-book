package vo1;

public class OperatorRelational {

	public static void main(String[] args) {
		OperatorRelational relational = new OperatorRelational();
		relational.relational();
	}

	public void relational() {
		int intValue1 = 1;
		int intValue2 = 2;

		System.out.println(intValue1 > intValue2);
		System.out.println(intValue1 < intValue2);
		System.out.println(intValue1 >= intValue2);
		System.out.println(intValue1 <= intValue2);
	}
}
