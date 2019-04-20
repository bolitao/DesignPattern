package xyz.bolitao.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observers = new ArrayList<>();
    private String msg;

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void addAttach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    @Override
    public void deleteAttach(Observer observer) {
        observers.remove(observer);
    }
}
