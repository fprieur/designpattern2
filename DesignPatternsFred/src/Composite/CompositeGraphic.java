package Composite;

import java.util.ArrayList;
import java.util.List;

class CompositeGraphic extends Graphic {

    //Collection of child graphics.
    private List<Graphic> childGraphics;
    private final String name;

    CompositeGraphic(String name) {
        this.name = name;
        this.childGraphics = new ArrayList<Graphic>();
    }

    //Prints the graphic.
    @Override
    public void print() {
        super.print();
        System.out.println(name);
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        graphic.setParent(this);
        childGraphics.add(graphic);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        for (Graphic graphic : childGraphics) {
            graphic.setLevel(getLevel() + 1);
        }
    }

    //Removes the graphic from the composition.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
