
package singleton_example.example3;

public class ThirdExample {
    private static volatile ThirdExample instance = null;

    private ThirdExample() {}

    public static ThirdExample getInstance() {
        if (instance == null) {
            synchronized(ThirdExample.class) {
                if (instance == null) {
                    instance = new ThirdExample();
                }
            }
        }
        return instance;
    }
}
