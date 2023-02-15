package Observers;

import Observable.Subject;

public class Observer2 implements Observer{

    private String line;
    private Subject observedclass;

    public Observer2 (Subject observedclass){

        this.observedclass=observedclass;
        this.observedclass.registerObserver(this);
    }

    public void update(String line) {
        this.line = line;
        display();
    }

    public void display(){

        String[] tab = line.split(" ");
        System.out.println("Liczba slow w linijce: " + (tab.length));
    }
}
