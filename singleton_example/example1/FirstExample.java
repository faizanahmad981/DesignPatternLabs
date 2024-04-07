package singleton_example.example1;

public class FirstExample {
    private static FirstExample instance = null;
    private int value;

    private FirstExample() {}

    public static FirstExample getInstance() {
        if (instance == null) {
            instance = new FirstExample();
        }
        return instance;
    }

    public static void destruct() {
        instance = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
