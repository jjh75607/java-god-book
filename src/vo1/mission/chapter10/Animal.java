package vo1.mission.chapter10;

public class Animal {

    private String name;
    private String kind;

    private int legCount;
    private int iq;

    private  boolean hasWing;

    public void move(String name) {
        System.out.println(name + " : move");
    }

    public void eatFood(String name) {
        System.out.println(name + " : eat food");
    }
}
