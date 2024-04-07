
package singleton_example.databasetask2;

public class Demo {
    public static void main(String[] args) {
        Connection c = Connection.getInstance();
        c.getData();
    }
}

