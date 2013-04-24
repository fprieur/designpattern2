package Observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notification that something has changed in " + o.toString());
    }
}
