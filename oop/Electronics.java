package hus.oop;

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
        if (!(product instanceof Electronics electronics)) return false;
        return this.getName().equals(electronics.getName()) ;

    }

}
