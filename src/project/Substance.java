package project;

import java.util.ArrayList;
import java.util.List;

class Substance implements Subject {
    private int temperature;
    private List<Observer> observers;

    public Substance() {
        this.temperature = 0;
        this.observers = new ArrayList<>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}