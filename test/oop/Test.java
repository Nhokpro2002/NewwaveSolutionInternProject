/*
package hus.oop;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test extends Thread {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        WebE_commerce webECommerce = WebE_commerce.getWebInstance();
        webECommerce.init();
        WebE_commerce.inventory.displayAllProducts();


        // Account Customer WebE-commerce that you created
        Customer customer = new Customer("Nhokpro2002", "loser@gmail.com", "Loser2002", null);
        // Account Admin who manage WebE-commerce
        Admin admin = new Admin("Boss", "boss@gmail.com", "I am boss", null);


            System.out.print("Please enter the password: ");
            String password = sc.nextLine();
            if (customer.checkSignIn(password)) {
                System.out.println("User logged in");
                //
                Product product = new Clothing("Hat",50, "costume",1,3, "plastic");
                //Product product1 = new Electronics("Asus TUF Gaming 2020",28888, "Computer",1,"ASUS", "2020");
                for (Product item: WebE_commerce.getInventory().getProductList()) {
                    if (item.equals(product)) {
                        List<Product> productList = new ArrayList<>();
                        productList.add(product);
                        Order newOrder = new Order("Clothing001",
                                customer,
                                admin,
                                productList,
                                product.getPrice());

                        //newOrder.addProduct(product);
                        newOrder.addObserver(customer);
                        newOrder.addObserver(admin);
                        newOrder.setTotalPrice(product.getPrice());
                        System.out.println("Customer buy product: " + product.getName());
                        customer.buyProduct(product, WebE_commerce.inventory);

                        System.out.println("Customer pay by PalPal(number 1) or pay by CreditCard(number 2)");
                        System.out.print("Please enter number:");
                        int number = sc.nextInt();
                        if (number == 1) {
                            customer.payByPayPay(product);
                        }
                        else if (number == 2) {
                            customer.payByCreditCard(product);
                        }
                        else {
                            System.out.println("Invalid number, please try again");
                        }
                    }
                }
            }
    }

}

*/
