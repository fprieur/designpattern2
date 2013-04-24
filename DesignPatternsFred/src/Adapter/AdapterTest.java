package Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {

    public static void Test() {
        List<IEmployee> list = new ArrayList<IEmployee>();
        list.add(new Employee("Tom"));
        list.add(new Employee("Jerry"));
        list.add(new ConsultantToEmployeeAdapter("Bruno"));  //consultant from existing class

        for (IEmployee employee : list) {
            employee.ShowHappiness();
        }
    }
}
