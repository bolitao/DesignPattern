package xyz.bolitao.observer;

public class ObserverC implements Observer {

    @Override
    public void update(String msg) {
        System.out.println(this.getClass().getName() + ": " + msg);
    }
}
