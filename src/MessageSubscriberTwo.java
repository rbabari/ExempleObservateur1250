public class MessageSubscriberTwo implements Observer
{
    public void update(Message m)
    {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}
