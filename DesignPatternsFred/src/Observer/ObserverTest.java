package Observer;

public class ObserverTest {

    public static void Test() {
        ConcreteObserver concreteObserver = new ConcreteObserver();
        Subject subject = new Subject();
        subject.addObserver(concreteObserver);
        System.out.println("Changing something to Subject.");
        subject.ChangeSomething();
    }
}
