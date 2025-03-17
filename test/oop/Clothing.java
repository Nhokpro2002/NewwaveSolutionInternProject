package test.oop;


public class Clothing extends Product {

    private int size;
    private String material;

    public Clothing(String name, double price, String category, int stock, int size, String material) {
        super(name, price, category, stock);
        this.size = size;
        this.material = material;
    }

    @Override
    public boolean equals(Product product) {
        if (this == product) return true;
        if (!(product instanceof Clothing clothing)) return false;
        return this.getName().equals(clothing.getName()) && this.getSize() == clothing.getSize();

    }

    @Override
    public String toString() {
        return "Clothing{" + super.toString() +
                "size=" + size +
                ", material='" + material + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
