package test.collections.set;

import java.util.HashSet;

public class HashSetExe {
    HashSet<Product> productHashSet = new HashSet<>();
    HashSet<User> userHashSet = new HashSet<>();

    public boolean isEmailExit(String email) {
        return userHashSet.contains(new User(email));
    }

    public HashSet<User> getUserHashSet() {
        return userHashSet;
    }

    public HashSet<Product> getProductHashSet() {
        return productHashSet;
    }

}
