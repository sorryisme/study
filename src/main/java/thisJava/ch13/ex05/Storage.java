package thisJava.ch13.ex05;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
