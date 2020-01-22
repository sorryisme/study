package thisJava.ch13.ex05;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<TV, String, String> product = new ChildProduct<>();
        
        product.setKind(new TV());
        product.setModel("SmartTV");
        product.setCompany("samsung");
        
        Storage<TV> storage = new StorageImpl<>(100);
        storage.add(new TV(), 0);
        TV tv =storage.get(0);

    }
}
