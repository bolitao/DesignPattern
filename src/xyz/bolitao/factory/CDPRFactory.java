package xyz.bolitao.factory;

public class CDPRFactory implements Factory {
    @Override
    public Product produce(String name) {
        return new RPGGame(name);
    }

//    @Override
//    public Product produce(String name, String type) {
//        switch (type) {
//            case "ACT":
//                return new ACTGame(name);
//            case "RPG":
//                return new RPGGame(name);
//            default:
//                return null;
//        }
//    }
}
