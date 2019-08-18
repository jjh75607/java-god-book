package vo1;

public class Car {

    int speed;
    int distance;

    String color;

    Car() {}

    public void speedUp() {
        speed = speed + 5;
    }

    public void breakDown() {
        speed = speed - 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }

}
