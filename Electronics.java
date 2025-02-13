package newwavesolution.basic;

import java.util.Objects;

public class Electronics extends Product {

    private String brand;
    private String date;

    public Electronics(String name, double price, String category, int stock, String brand, String date) {
        super(name, price, category, stock);
        this.brand = brand;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Electronics{" + super.toString() + "brand=" + brand + ", date=" + date + '}';
    }

    @Override
    public boolean equals(Product product) {
        if (this == product) return true;
        if (product == null || getClass() != product.getClass()) return false;
        Electronics electronics = (Electronics) product;
        return Objects.equals(getName(), electronics.getName());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

}
