public interface Subject {
    public void subscribe(Listener l);
    public void unsubscribe(Listener l);
    public void notify_all();
}