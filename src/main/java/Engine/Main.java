package Engine;

public class Main {
    public static void main(String[] args) {

        Engine engine = Engine.getInstance();

        engine.setIsEngineWorking(true);

        System.out.println(engine.getIsEngineWorking());
    }
}
