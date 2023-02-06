class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(2, "blue");
        Vehicle v1 = new Car();
        Car c1 = new Car();
        //Car c2 = new Vehicle(); // This is illegal, since vehicle is not a car

        // guess what is the output of the following statement

        System.out.println(c1 instanceof Vehicle);
        System.out.println(v1 instanceof Vehicle);
        System.out.println(v1 instanceof Car);
        System.out.println(v instanceof Car);

        c1.run();
        v1.run();
        c1.run("good");

        System.out.println(c1.getSpeed());
        //System.out.println(v1.getSpeed());
    }

}