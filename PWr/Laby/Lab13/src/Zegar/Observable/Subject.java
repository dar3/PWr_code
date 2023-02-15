package Zegar.Observable;

import Zegar.Observers.Observer;

public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
