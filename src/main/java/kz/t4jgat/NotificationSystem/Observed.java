package kz.t4jgat.NotificationSystem;

// Interface for observed object
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
