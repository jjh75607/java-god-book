package vo1.chapter1ToChapter9;

public class OperatorConditionalTriple {

	public static void main(String[] args) {
		OperatorConditionalTriple triple = new OperatorConditionalTriple();
		triple.doBlindDate(30);
		triple.doBlindDate(80);
	}

	public boolean doBlindDate(int point) {
		boolean doBlindDateFlag = false;
		doBlindDateFlag = (point >= 80) ? true : false;

		System.out.println("point : " + doBlindDateFlag);

		return doBlindDateFlag;
	}
}
