public class OperatorCasting {

	public static void main(String[] args) {
		OperatorCasting casting = new OperatorCasting();
		casting.casting();
	}

	public void casting() {
		byte byteVaule = 127;
		short shortValue = byteVaule;

		shortValue++;
		System.out.println(shortValue);

		byteVaule = (byte) shortValue;
		System.out.println(byteVaule);
	}
}
