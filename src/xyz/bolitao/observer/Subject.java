package xyz.bolitao.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
//    List<Observer> observers = new ArrayList<>();

    public void setMsg(String msg);

    public void addAttach(Observer observer);

    public void notifyObserver();

    public void deleteAttach(Observer observer);
}
