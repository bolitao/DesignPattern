package xyz.bolitao.singleton;

public class Main {
    public static void main(String[] args) {
        // 不能如下这么写，因为构造函数为 private 不能实例化
//        SingleObject object = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        object.show();
    }
}
