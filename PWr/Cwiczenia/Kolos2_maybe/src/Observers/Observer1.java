package Observers;

import MojWyjatek.mojwyjatek;
import Observable.Subject;

public class Observer1 implements Observer {

    private String line;
    private Subject observedclass;

    public Observer1 (Subject observedclass){

        this.observedclass=observedclass;
        this.observedclass.registerObserver(this);
    }

    public void update(String line) {
        this.line = line;
        display();
    }

    public void display(){
        System.out.println("Linijka:");
        System.out.println(line);
    }

}
