package Baitap.Inheritance.Triangle;

public class Share {
    private String color;

    public Share() {

    }

    public Share(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color = " + color;
    }
}
