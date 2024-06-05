package Thuchanh.ss22_Structural_Design_Pattern.Facade;

public class SocialMediaFacade {

    private Twitter twitter;
    private Facebook facebook;
    private Linkedln linkedln;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, Linkedln linkedln) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedln = linkedln;
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedln.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.facebook.share();
    }
}
