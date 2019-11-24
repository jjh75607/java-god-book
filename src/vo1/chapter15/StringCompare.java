package vo1.chapter15;

public class StringCompare {

    public static void main(String[] args) {
        StringCompare sample = new StringCompare();

        String[] addresses = new String[]{
                "서울시 구로구 신도림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동"
        };

        sample.checkTrim();
    }

    public void checkTrim() {
        String[] strings = new String[]{
                " a",
                " b ",
                "     c",
                "d  ",
                "e   f",
                "      "
        };

        for (String string : strings) {
            System.out.println("[" + string + "]");
        }
    }

    public void checkSplit() {
        String text = "Java technology is boyh a programming language and a platform";
        String[] splitArray = text.split(" ");

        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    public void checkSubstring() {
        String text = "java technology";
        String technology = text.substring(5);

        System.out.println(technology);
    }

    public void checkMatch() {
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";

        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));

    }

    public void checkLastIndexOf() {
        String text = "Java technology is boyh a programming language and a platform";

        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf("z"));
    }

    public void checkIndexOf() {
        String text = "Java technology is boyh a programming language and a platform";

        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf("z"));
    }

    public void checkString() {
        String text = "가나다";

        System.out.println(text.length());
        System.out.println(text.isEmpty());
    }

    public void checkCompare() {
        String text = "Check value";
        String text2 = new String("Check value");

        if (text == text2) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

        if (text.equals(text2)) {
            System.out.println("same2");
        }

        String text3 = "check value";

        if (text.equalsIgnoreCase(text3)) {
            System.out.println("same3");
        }
    }

    public void checkCompareTo() {
        String text = "a";
        String text2 = "b";
        String text3 = "c";

        System.out.println(text2.compareTo(text));
        System.out.println(text2.compareTo(text3));
        System.out.println(text.compareTo(text3));
    }

    public void checkAddress(String[] addresses) {
        int startCount = 0;
        int endCount = 0;

        String startText = "서울시";
        String endText = "동";

        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }

            if (address.endsWith(endText)) {
                endCount++;
            }
        }

        System.out.println(startCount + "" + startText);
        System.out.println(endCount + "" + endText);

    }

    public void containsAddress(String[] addresses) {
        int containCount = 0;
        String containText = "구로";

        for (String address : addresses) {
            if (address.contains(containText)) {
                containCount++;
            }
        }

        System.out.println(containText + " " + containCount);
    }
}
