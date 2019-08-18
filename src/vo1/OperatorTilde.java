package vo1;

public class OperatorTilde {

	public static void main(String[] args) {
		OperatorTilde tilde = new OperatorTilde();

		byte b = 127;
		tilde.printTildeResult(b);

		b = 1;
		tilde.printTildeResult(b);
	}

	public void printTildeResult(byte b) {
		System.out.println("Original value = " + b);
		System.out.println("Tilde value = " + ~b);
	}
}
