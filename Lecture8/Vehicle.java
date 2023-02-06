public class Vehicle {
    public int speed;
    private String color;

    public Vehicle() {
        this.speed = 0;
        this.color = "";
    }

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public void run() {
        System.out.println("The Vehicle is running!");
    }

    public void run(String tag) {
        // this is an example of method overload
        System.out.println("The Vehicle is running! " + tag);
    }

}

