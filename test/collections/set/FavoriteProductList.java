package test.collections.set;

import java.util.List;

public class FavoriteProductList {
    List<Product> favoriteProductList;

    public FavoriteProductList(List<Product> favoriteProductList) {
        this.favoriteProductList = favoriteProductList;
    }

    public List<Product> getFavoriteProductList() {
        return favoriteProductList;
    }

    public boolean check(Product product) {
       for (Product item: favoriteProductList) {
           if (item.equals(product)) {
               return true;
           }
       }
       return false;
    }
}
