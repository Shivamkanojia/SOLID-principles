public class SuvCar extends Car implements IFourWheel {

    public SuvCar(String name) {
        super(name);

    }

    @Override
    public void Fourwheeldrive() {
        System.out.println("FourWheel Car");

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
