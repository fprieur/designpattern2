package Observer;

public class Subject extends Observable {

    public void ChangeSomething() {
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "Subject";
    }
}
