import java.util.Arrays;
public class Car extends Vehicle {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] ar = {getSeats(), getMaxSpeed()};
        return ar;
    }

    public static void main(String[] args) {
        Car c1 = new Car(4, 69);
        System.out.println(Arrays.toString(c1.spec()));
    }
}
