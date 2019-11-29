package vo1.mission.chapter15;

public class UseStringMethods {

    public static void main(String[] args) {
        UseStringMethods.printWords("The String Class represents character strings.");
        UseStringMethods.findString("The String Class represents character strings.", "string");
        UseStringMethods.findAnyCaseString("The String Class represents character strings.", "string");
        UseStringMethods.countChar("The String Class represents character strings.", 's');
        UseStringMethods.printContainWords( "The String Class represents character strings.", "ss");
    }

    public static void printWords(String str) {
        String[] strings = str.split(" ");

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void findString(String str, String findStr) {
        System.out.println(str.indexOf(findStr));
    }

    public static void findAnyCaseString(String str, String findStr) {
        System.out.println(str.toLowerCase().indexOf(findStr));
    }

    public static void countChar(String str, char c) {
        int count = 0;
        char[] chars = str.toCharArray();

        for (char c1 : chars) {
            if (c == c1) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void printContainWords(String str, String findStr) {
        String[] strings = str.split(" ");

        for (String string: strings) {
            if (string.contains(findStr)) {
                System.out.println(true);
            }
        }
    }
}
