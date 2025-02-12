package newwavesolution.basic;

import java.util.Date;

public class Electronics extends Product {

    private String brand;
    private Date date;

    public Electronics(String name, double price, String category, int stock, String brand, Date date) {
        super(name, price, category, stock);
        this.brand = brand;
        this.date = date;
    }

    public String getBrand() {
        return brand;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Electronics{" + super.toString() + "brand=" + brand + ", date=" + date + '}';
    }


}
