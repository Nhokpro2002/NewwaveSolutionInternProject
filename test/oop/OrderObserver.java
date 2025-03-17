package test.oop;

public interface OrderObserver {
    void update(String orderId, String newState);
}
