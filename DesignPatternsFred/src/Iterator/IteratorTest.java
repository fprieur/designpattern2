package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public static void Test() {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Test1");
        list.add("Test2");
        list.add("Test3");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
            if (iter.hasNext()) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
