package newwavesolution.collections.set;

import java.util.HashSet;

public class UserHashSet {

    HashSet<User> userHashSet = new HashSet<>();

    public boolean isEmailExit(String email) {
        return userHashSet.contains(new User(email));
    }

}
