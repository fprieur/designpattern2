package AbstractFactory;

class OSXFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
