package AbstractFactory;

public class AbstractFactoryTest {

    public static void Test() {
        Application application = new Application(createOsSpecificFactory());
    }

    public static GUIFactory createOsSpecificFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile(String osType) {
        return 1;
    }
}
