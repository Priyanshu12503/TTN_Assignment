public class CarMaker {

    public static Car createCar(String engineType) {

        Engine engine = new EngineFactory().getEngine(engineType);
        if (engine == null) {
            System.out.println("Invalid input");
            return null;
        }
        return new Car(engine);
    }
}