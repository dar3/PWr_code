package Observable;
import MojWyjatek.mojwyjatek;
import Observers.*;

import java.util.ArrayList;

public class ObservedClass implements Subject {

    ArrayList<Observer> ObserverList = new ArrayList<Observer>();
    private String line;

    public void registerObserver(Observer observer)
    {
        ObserverList.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        ObserverList.remove(observer);
    }

    public void notifyObservers() throws mojwyjatek
    {
        for(int i = 0; i<ObserverList.size(); i++)
            ObserverList.get(i).update(line);

    }

    public void measurementsChanged(String line) throws mojwyjatek
    {
        this.line = line;
        notifyObservers();
    }

    public void setMeasurements(String line) throws mojwyjatek
    {
        measurementsChanged(line);
    }


}
