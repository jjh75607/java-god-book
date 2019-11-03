package vo1.chapter10.c.inheritance;

public class ChildOverriding extends ParentOverriding{

    public ChildOverriding() {
        System.out.println("ChildOverriding con");
    }

    public void printName() {
        System.out.println("childOverriding printname");
    }
}
