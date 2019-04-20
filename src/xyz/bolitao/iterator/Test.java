package xyz.bolitao.iterator;

public class Test {
    public static void main(String[] args) {
        String[] names = {"A", "John", "H", "Lily"};
        NameAggregate nameAggregate = new NameAggregate(names);
        Iterator iterator = nameAggregate.getIterator();
//        NameIterator iterator = new NameIterator(nameAggregate.names);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
