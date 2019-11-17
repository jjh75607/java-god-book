package vo1.chapter13;

public class OverTimeManager2 {

    public static void main(String[] args) {
        OverTimeValues2 values2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(values2);
        System.out.println(values2.getAmount());

        OverTimeValues2 value3 = OverTimeValues2.WEEKEND_FOUR_HOUR;
        System.out.println(values2.compareTo(value3));
    }
}
