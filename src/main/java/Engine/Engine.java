package Engine;

public class Engine {
    private static Engine instance = null;
    private boolean isEngineWorking = false;

    private Engine() {}

    public static synchronized Engine getInstance() {
        if (instance == null) {
            instance = new Engine();
        }
        return instance;
    }

    public boolean getIsEngineWorking() {
        return isEngineWorking;
    }

    public void setIsEngineWorking(boolean isEngineWorking) {
        this.isEngineWorking = isEngineWorking;
    }

}
