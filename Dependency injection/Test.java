public class Test {
    public static void main(String[] args) {
        SuvCar sv1 = new SuvCar("Mustang", new V6engine());
        SuvCar sv2 = new SuvCar("Ford", new FourCengine());

        sv1.start();
        sv2.start();
        sv1.stop();
        sv2.stop();

    }
}
