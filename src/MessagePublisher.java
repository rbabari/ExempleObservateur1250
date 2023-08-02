import java.util.ArrayList;
import java.util.List;
public class MessagePublisher implements Observable{
   private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifySubscribers(Message message) {
        for (Observer o: observers) {
            o.update(message);
        }
    }
}
