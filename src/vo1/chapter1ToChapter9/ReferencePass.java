package vo1.chapter1ToChapter9;

public class ReferencePass {

    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        reference.callPassByReference();
    }

    public void callPassByReference() {
        MemberDTO member = new MemberDTO("name");

        System.out.println("before passByReference");
        System.out.println("name : " + member.name);

        passByReference(member);

        System.out.println("after passByReference");
        System.out.println("name : " + member.name);
    }

    public void passByReference(MemberDTO memberDTO) {
        memberDTO.name = "change";

        System.out.println("in passByReference");
        System.out.println("name : " + memberDTO.name);
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";

        System.out.println("before passByValue");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        passByValue(a, b);

        System.out.println("after passByValue");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";

        System.out.println("in passByValue");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

}
