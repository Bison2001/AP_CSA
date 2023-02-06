public class Car extends Vehicle{

    private int num_wheels;

    public Car() {
        super();
    }

    public Car(int speed, String color, int num_wheels) {
        super(speed, color);
        this.num_wheels = num_wheels;
    }

    public void run() {
        // this is an example of method override
        System.out.println("The Car is running");
    }

    public int getSpeed() {
        return super.speed;
    }

    public void setSpeed(int speed) {
        super.speed = speed;
    }


    // public int accesstest() {
    //     // you cannot access the private variable of the super class
    //     super.color;
    // }

}
