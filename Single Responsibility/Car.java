public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    // getter

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Car Started");
    }

    public void stop() {
        System.out.println("Car Stopped");
    }

}
