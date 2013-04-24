package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observers;
    private Boolean hasChanged;

    Observable() {
        observers = new ArrayList<Observer>();
    }

    public void setChanged() {
        hasChanged = true;
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        if (hasChanged) {
            for (Observer observer : observers) {
                observer.update(this, arg);
            }
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
