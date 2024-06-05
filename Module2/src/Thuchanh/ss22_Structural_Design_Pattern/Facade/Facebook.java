package Thuchanh.ss22_Structural_Design_Pattern.Facade;

public class Facebook implements SocialShare {

    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: " + this.message);
    }
}
