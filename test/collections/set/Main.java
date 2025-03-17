/*
package newwavesolution.collections.set;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product0 = new Product("TV", "Electronic", 11111);
        Product product1 = new Product("Fridge", "Electronic", 11112);
        Product product2 = new Product("Laptop", "Electronic", 111);
        Product product3 = new Product("PC", "Electronic", 11134);
       */
/* Product product4 = new Product("Outlet", "Electronic", 41411);
        Product product5 = new Product("LightBup", "Electronic", 1411);
        Product product6 = new Product("Lamp", "Electronic", 4561);*//*


        User user0 = new User("user0@gmail.com");
        User user1 = new User("user1@gmail.com");
        User user2 = new User("user2@gmail.com");
        User user3 = new User("user3@gmail.com");
        User user4 = new User("user4@gmail.com");


        // Test HasSetExe
        HashSetExe HashSetExe = new HashSetExe();
        HashSetExe.getProductHashSet().add(product0);
        HashSetExe.getProductHashSet().add(product1);
        HashSetExe.getProductHashSet().add(product2);
        HashSetExe.getProductHashSet().add(product3);

        HashSetExe.getUserHashSet().add(user0);
        HashSetExe.getUserHashSet().add(user1);
        HashSetExe.getUserHashSet().add(user2);
        HashSetExe.getUserHashSet().add(user3);
        HashSetExe.getUserHashSet().add(user4);

        //Test TreeSetExe
        TreeSetExe treeSetExe = new TreeSetExe();
        treeSetExe.addProduct(product0);
        treeSetExe.addProduct(product1);
        treeSetExe.addProduct(product2);

        //Test FavoriteProductList
        List<Product> favoriteList = new ArrayList<>();
        favoriteList.add(product0);
        favoriteList.add(product1);
        FavoriteProductList favoriteProductList = new FavoriteProductList(favoriteList);
        System.out.println(favoriteProductList.check(new Product("TV", "Electronic", 13451)));


    }
}
*/
