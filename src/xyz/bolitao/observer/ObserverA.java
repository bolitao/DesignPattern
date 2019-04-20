package xyz.bolitao.observer;

public class ObserverA implements Observer {

    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName() + ": " + msg);
    }
}
