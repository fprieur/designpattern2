package Composite;

public class CompositeTest {

    public static void Test() {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse("ellipse1");
        Ellipse ellipse2 = new Ellipse("ellipse2");
        Ellipse ellipse3 = new Ellipse("ellipse3");
        Ellipse ellipse4 = new Ellipse("ellipse4");

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic("graphic");
        CompositeGraphic graphic1 = new CompositeGraphic("graphic1");
        CompositeGraphic graphic2 = new CompositeGraphic("graphic2");

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
    }
}