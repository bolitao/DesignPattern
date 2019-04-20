package xyz.bolitao.proxy;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Access image by proxy");
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
