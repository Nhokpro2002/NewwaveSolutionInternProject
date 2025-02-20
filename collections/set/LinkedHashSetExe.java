package newwavesolution.collections.set;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetExe {

    private LinkedHashSet<Order> orderLinkedHashSet = new LinkedHashSet<>();

    public LinkedHashSetExe(LinkedHashSet<Order> orderLinkedHashSet) {
        this.orderLinkedHashSet = orderLinkedHashSet;
    }

    public void addFinishedOrder(Order order) {
        orderLinkedHashSet.add(order);
    }

    public LinkedHashSet<Order> getOrderLinkedHashSet() {
        return this.orderLinkedHashSet;
    }
}
