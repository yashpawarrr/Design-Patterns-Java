package observerDP;

public class Demo {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber yash = new Subscriber("yash");
        Subscriber khush = new Subscriber("khush");
        channel.subscribe(yash);
        channel.subscribe(khush);

        channel.notifyChanges("Learn DP");

    }
}
