import java.util.ArrayList;
import java.util.List;

public class Creator {
    private String creativeWork;
    List<Subscriber> fans = new ArrayList<>();

    public void follow(Subscriber fan) {
        fans.add(fan);
    }

    public void unfollow(Subscriber fan) {
        fans.remove(fan);
    }

    private void notifySubscriber() {
        for (Subscriber fan: fans){
            fan.update();
        }
    }

    public void upload(String creativeWork) {
        this.creativeWork = creativeWork;
        notifySubscriber();
    }

}
