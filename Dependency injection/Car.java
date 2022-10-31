public abstract class Car {
    protected String name;
    protected Engine engine;

    public Car(String name, Engine e) {
        this.name = name;
        this.engine = e;
    }

    public abstract void start();

    public abstract void stop();

}