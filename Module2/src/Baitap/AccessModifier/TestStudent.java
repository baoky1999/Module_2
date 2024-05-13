package Baitap.AccessModifier;

class Students {
    private String name = "john";
    private String classes = "C02";

    public Students() {

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setClass(String newClasses) {
        this.classes = newClasses;
    }
}
public class TestStudent {
    public static void main(String[] args) {
        Students student = new Students();

        student.setName("Kỳ");
        student.setName("C03");
    }
}
