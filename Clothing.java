package newwavesolution.basic;

import java.util.Objects;

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
        if (product == null || getClass() != product.getClass()) return false;
        Clothing clothing = (Clothing) product;
        return this.size == clothing.size && this.getName().equals(clothing.getName());
                //&& Objects.equals(getName(), clothing.getName())
               // && Objects.equals(this.material, clothing.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMaterial(), getSize(), getCategory());
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
