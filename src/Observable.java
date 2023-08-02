public interface Observable { // Publisher
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifySubscribers(Message message);

}
