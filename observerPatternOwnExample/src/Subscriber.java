public class Subscriber implements observer{
    private String  username;
    private Creator creator;

    public Subscriber(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Hey "+username+", you have a new gift from your CREATOR");
    }

    @Override
    public void subscribeCreator(Creator creator) {
        this.creator = creator;
    }
}
