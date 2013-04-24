package Decorator;

abstract class WindowDecorator extends Window {

    protected Window decoratedWindow; // the Window being decorated

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    public void draw() {
        decoratedWindow.draw(); //delegation
    }

    public String getDescription() {
        return decoratedWindow.getDescription(); //delegation
    }
}
