package newwavesolution.basic;

import java.io.FileNotFoundException;


public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        WebE_commerce webECommerce = WebE_commerce.getWebInstance();
        webECommerce.init();
        WebE_commerce.inventory.displayAllProducts();
        WebE_commerce.userManager.showAllUsers();


    }
}

