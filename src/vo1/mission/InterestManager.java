package vo1.mission;

public class InterestManager {

	public static void main(String[] args) {
		InterestManager manager = new InterestManager();

		for(int i = 1; i <= 365; i += 10) {
			System.out.println(manager.calculateAmount(i, 1000000));
		}
	}

	public double getInterestRate(int day) {
		if (day <= 90) {
			return 0.5;
		} else if (day <= 180) {
			return 1;
		} else if (day <= 364) {
			return 2;
		} else {
			return 5.6;
		}
	}

	public double calculateAmount(int day, long amount) {
		return amount + getInterestRate(day);
	}


}
