package test.collections.set;

import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // Sắp xếp tăng dần theo giá
    }

    @Override
    public boolean equals(Object object) {
        if (this == null) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Product product = (Product) object;
        return this.name.equals(product.getName())
                && this.category.equals(product.getCategory())
                && this.price == product.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
