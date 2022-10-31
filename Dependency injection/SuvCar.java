public class SuvCar extends Car {

    public SuvCar(String name, Engine e) {
        super(name, e);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void start() {
        System.out.println("started" + name + engine);

    }

    @Override
    public void stop() {
        System.out.println("Stopped");

    }

}
