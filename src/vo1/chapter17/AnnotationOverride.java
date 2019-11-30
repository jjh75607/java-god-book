package vo1.chapter17;

import vo1.chapter10.c.inheritance.Parent;

public class AnnotationOverride extends Parent {

    @Override
    public void printName() {
        System.out.println("AnnotationOverride");
    }

}
