public class EngineFactory {

    public Engine getEngine(String s){

        if(s.equalsIgnoreCase("petrol"))
        {
            return new PetrolEngine();
        } else if (s.equalsIgnoreCase("diesel")) {
            return new DieselEngine();
        }
        return null;
    }
}
