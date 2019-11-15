package vo1.chapter12;

public class Equals {

    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
    }

    public void equalMethod() {
        MemberDTO obj1 = new MemberDTO("s");
        MemberDTO obj2 = new MemberDTO("s");

        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is ame");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }

    public void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("s");
        MemberDTO obj2 = new MemberDTO("s");

        if (obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is ame");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}

