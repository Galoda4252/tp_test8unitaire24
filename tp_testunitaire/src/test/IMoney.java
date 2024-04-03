package test;

public interface IMoney {
    int amount();
    String currency();
    IMoney add(IMoney m);
}
