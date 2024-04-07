import singleton_example.example1.FirstExample;
import singleton_example.example2.SecondExample;
import singleton_example.example3.ThirdExample;;
public class App {
    public static void main(String[] args) throws Exception {
        // Using the FirstExample class
        FirstExample.getInstance().setValue(42);
        System.out.println("value  of (FirstExample)= " + FirstExample.getInstance().getValue());
        FirstExample.destruct();

        // Using the SecondExample class
        SecondExample.getInstance().setValue(24);
        System.out.println("value of (SecondExample)= " + SecondExample.getInstance().getValue());

        //using third example
        ThirdExample instance = ThirdExample.getInstance();
        System.out.println("Output of Task 1 Example # 3 is:  ");
        System.out.println("Instance: " + instance);
    }
}
