package AbstractFactory;


class OSXButton implements Button {

    @Override
    public void paint() {
        System.out.println("I'm an OSXButton");
    }
}
