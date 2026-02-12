public class Car {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("setEngine() called...");
        this.engine = engine;
    }

    public Car(){

    }
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){

        engine.usesFuel();

        System.out.println("car is being driven");
    }
}