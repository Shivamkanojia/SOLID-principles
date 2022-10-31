public abstract class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public abstract void start();

    public abstract void stop();

    // these methods should be interface cause by implemting abstract class we have
    // to implement all the methods so making interface ;

    // public abstract void Fourwheeldrive();

    // public abstract void Openroof();

}