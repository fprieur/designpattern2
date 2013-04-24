package Strategy;

public class StrategyTest {

    public static void Test() {
        Context context;
        int a = 3;
        int b = 4;

        System.out.println("a = " + a + ", b = " + b);
        // Three contexts following different strategies
        context = new Context(new Add());
        int resultA = context.executeStrategy(a, b);

        context = new Context(new Subtract());
        int resultB = context.executeStrategy(a, b);

        context = new Context(new Multiply());
        int resultC = context.executeStrategy(a, b);

        System.out.println("Result A (Add): " + resultA);
        System.out.println("Result B (Subtract): " + resultB);
        System.out.println("Result C (Multiply): " + resultC);
    }
}
