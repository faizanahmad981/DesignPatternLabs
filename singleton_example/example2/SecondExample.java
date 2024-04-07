package singleton_example.example2;

public class SecondExample {
    private static final SecondExample instance = new SecondExample();
    private int value;

    private SecondExample() {
        // Private constructor to prevent instantiation from outside
    }

    public static SecondExample getInstance() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value_) {
        value = value_;
    }

    
}
