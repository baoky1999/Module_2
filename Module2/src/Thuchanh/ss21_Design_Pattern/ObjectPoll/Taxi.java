package Thuchanh.ss21_Design_Pattern.ObjectPoll;

public class Taxi {

    private String name;

    public Taxi(){}

    public Taxi(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi{ " + "name='" + name + '\'' + '}';
    }
}
