package newwavesolution.basic;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        int count = 0;
        Product product = new Product("Laptop Gaming", 200000, "Laptop", 5);
        System.out.println("Product Information: ");
        System.out.println(product);

        //Check input password of User
        User user = new User("Nhat Nguyet Chi Nhan", "Nhokpro@gmail.com", "Loser");
        while (true) {
            System.out.print("Please enter your password: ");
            String userPasswordInput = sc.next();
            if (user.checkPasswordUserInput(userPasswordInput)) {
                System.out.println("Password Correct.");
                break;
            }
            else {
                System.out.println("Password Incorrect. Please try again.");
                ++count;
                if (count == 5) {
                    System.out.println("You have reached max tries");
                    break;
                }
            }
        }
        */

        Cart cart = Cart.getInstance();
        Product product = new Product("Laptop Gaming", 200000, "Laptop", 5);
        cart.listProduct.add(product);
        System.out.print("Number products in the Cart: ");
        System.out.println(cart.listProduct.size());
        System.out.print("Total price: ");
        System.out.println(cart.getTotalPrice());

    }
}
