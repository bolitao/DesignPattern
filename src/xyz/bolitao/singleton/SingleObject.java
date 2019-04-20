package xyz.bolitao.singleton;

public class SingleObject {
    private static SingleObject object = new SingleObject();

    // 单例模式中构造函数必须为 private
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return object;
    }

    // 下面写单例的具体方法
    public void show() {
        System.out.println("SingleInstance");
    }
}
