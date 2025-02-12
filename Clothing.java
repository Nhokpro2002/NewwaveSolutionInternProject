package newwavesolution.basic;

public class Clothing extends Product {

    private int size;
    private String material;

    public Clothing(String name, double price, String category, int stock, int size, String material) {
        super(name, price, category, stock);
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothing{" + super.toString() +
                "size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
}
