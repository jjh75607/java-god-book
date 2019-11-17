package vo1.chapter13;

public abstract class MemberManagerAbstract {

    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(MemberDTO member);
    public abstract boolean updateMember(MemberDTO member);

    public void printLog(String data) {
        System.out.println("data : " + data);
    }
}
