package Decorator;

public class DecoratorTest {

    public static void Test() {
        Window window = new SimpleWindow();
        System.out.println(window.getDescription());

        window = new HorizontalScrollBarDecorator(window);
        System.out.println(window.getDescription());

        window = new VerticalScrollBarDecorator(window);
        System.out.println(window.getDescription());
    }
}
