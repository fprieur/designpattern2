package Visitor;

public class VisitorTest {

    public static void Test() {
        CarElement car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}