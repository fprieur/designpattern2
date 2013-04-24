package Composite;

// Leaf
public class Ellipse extends Graphic {

    private String name;

    Ellipse(String name) {
        this.name = name;
    }

    //Prints the graphic.
    @Override
    public void print() {
        super.print();
        System.out.println(name);
    }
}
