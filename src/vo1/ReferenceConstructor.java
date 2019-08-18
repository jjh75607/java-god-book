package vo1;

public class ReferenceConstructor {

    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("name");
        MemberDTO dto3 = new MemberDTO("name", "0200202020");
        MemberDTO dto4 = new MemberDTO("name", "0200202020", "23678");
    }
}
