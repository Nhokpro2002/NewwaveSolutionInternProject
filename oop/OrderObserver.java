package hus.oop;

public interface OrderObserver {
    void update(String orderId, String newState);
}
