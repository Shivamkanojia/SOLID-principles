public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Mustang");
        Car c2 = new Car("ferrari");
        // c1.start();
        // c2.start();
        Driver koe = new Driver();
        koe.drive(c1);
        koe.drive(c2);

        Mechanic joe = new Mechanic();
        joe.changetire(c1);
        joe.changetire(c2);
    }
}
