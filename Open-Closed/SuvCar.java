public class SuvCar extends Car {

    public SuvCar(String name) {
        super(name);

    }

    public void changemode() {
        System.out.println("Changed to sport mode");
    }

    @Override
    public void start() {

        System.out.println("Started ");
    }

    @Override
    public void stop() {
        System.out.println("stopped");

    }

}
