package xyz.bolitao.observer;

public class Test {
    public static void main(String[] args) {
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        ObserverC observerC = new ObserverC();
        ConcreteSubject subject = new ConcreteSubject();
        subject.addAttach(observerA);
        subject.addAttach(observerB);
        subject.addAttach(observerC);
        subject.setMsg("Hello");
        subject.notifyObserver();
        subject.deleteAttach(observerC);
        System.out.println("Delete observer C");
        subject.setMsg("Hello2");
        subject.notifyObserver();
    }
}
