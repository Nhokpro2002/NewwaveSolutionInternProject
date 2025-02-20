package newwavesolution.collections.set;

import java.util.TreeSet;

public class TreeSetExe {
    TreeSet<String> treeSet = new TreeSet<>();


    public TreeSet<String> getTreeSet() {
        return treeSet;
    }

    public void addProduct(Product product) {
        treeSet.add(product.getName());
    }
}
