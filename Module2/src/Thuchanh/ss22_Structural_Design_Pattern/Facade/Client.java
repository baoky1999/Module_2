package Thuchanh.ss22_Structural_Design_Pattern.Facade;

public class Client {

    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new Linkedln());
        socialMediaFacade.share(message);
    }
}
