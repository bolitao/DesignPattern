package xyz.bolitao.facade;

public class MiSmartHome {
    private Router router;
    private TV tv;
    private Lamp lamp;

    public MiSmartHome(Router router, TV tv, Lamp lamp) {
        this.router = router;
        this.tv = tv;
        this.lamp = lamp;
    }


    public void on() {
        router.on();
        lamp.on();
        tv.on();
    }

    public void off() {
        router.off();
        lamp.off();
        tv.off();
    }

    public void lampOn() {
        lamp.on();
    }

    public void lampOff() {
        lamp.off();
    }

    public void routerOn() {
        router.on();
    }

    public void routerOff() {
        router.off();
    }

    public void tvOn() {
        tv.on();
    }

    public void tvOff() {
        tv.off();
    }
}
