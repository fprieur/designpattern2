package Composite;


// Component
public abstract class Graphic {

    private int level;
    private Graphic parent;

    protected Graphic getParent() {
        return this.parent;
    }

    protected void setParent(Graphic parent) {
        this.parent = parent;
        setLevel(parent != null ? parent.getLevel() + 1 : 0);
    }

    protected int getLevel() {
        return this.level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    //Prints the graphic.
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
    }
}