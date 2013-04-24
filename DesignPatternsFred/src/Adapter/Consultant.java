package Adapter;

public class Consultant {

    private String name;

    public Consultant(String name) {
        this.name = name;
    }

    protected void ShowSmile() {
        System.out.println("Consultant " + this.name + " showed smile");
    }
}
