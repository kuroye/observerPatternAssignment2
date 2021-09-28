public class Patreon {
    public static void main(String[] args) {

        Subscriber a1 = new Subscriber("Erhan");
        Subscriber a2 = new Subscriber("Eshat");
        Subscriber a3 = new Subscriber("Magzhan");

        Creator WLOP = new Creator();

        WLOP.follow(a1);
        WLOP.follow(a2);
        WLOP.follow(a3);

        WLOP.unfollow(a3);

        a1.subscribeCreator(WLOP);
        a2.subscribeCreator(WLOP);
        a3.subscribeCreator(WLOP);

        WLOP.upload("Black swan");


    }
}
