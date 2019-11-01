package vo1.chapter1ToChapter9;

public class ControlSwitch {

	public static void main(String[] args) {
		ControlSwitch control = new ControlSwitch();

		control.switchStatement(1);
		control.switchStatement(2);
		control.switchStatement(3);
		control.switchStatement(4);
		control.switchStatement(6);
	}

	public void switchStatement(int numberOfWheel) {
		switch (numberOfWheel) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			default:
				System.out.println("default");
				break;
		}
	}
}
