package vo1.chapter10.c.inheritance;

public class ParentArg {

    public ParentArg(String name) {
        System.out.println(name);
    }

    public ParentArg(InheritancePrint obj) {
        System.out.println("par(InheritancePrint) - con");
    }

    public void printName() {
        System.out.println("printName");
    }
}
