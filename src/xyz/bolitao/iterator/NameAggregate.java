package xyz.bolitao.iterator;

public class NameAggregate implements Aggregate {
    public String[] names;

    public NameAggregate(String[] names) {
        this.names = names;
    }

    @Override
    public NameIterator getIterator() {
        return new NameIterator(names);
    }
}
