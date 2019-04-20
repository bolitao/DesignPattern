package xyz.bolitao.proxy;

public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("1.jpg");
        image.display();
        image.display();
    }
}
