// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // 0 - interface observer et observable

        // 1- créer des subscriber / observateurs
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();
        // 2- créer un publisher / observable
        MessagePublisher p = new MessagePublisher();
        // 3- attache / detache les subscribers au publisher
        p.attach(s1);
        p.attach(s2);
        p.attach(s3);
        // 4- notifier les subscribers / observateurs
        p.notifySubscribers(new Message("Premier message"));
        p.detach(s2);
        p.notifySubscribers(new Message("Deuxième message"));
    }
}