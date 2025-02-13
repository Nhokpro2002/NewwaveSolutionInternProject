package newwavesolution.basic;

public interface OrderObserver {
    void update(String orderId, String newState);
}
