package Adapter;

public class ConsultantToEmployeeAdapter extends Consultant implements IEmployee {

    public ConsultantToEmployeeAdapter(String name) {
        super(name);
    }

    @Override
    public void ShowHappiness() {
        super.ShowSmile();  //call the parent Consultant class
    }
}
