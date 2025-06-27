public class Singleton {
    private static Singleton instance;

    private Singleton() {
        //private constructor is created
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
