package newwavesolution.java8;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Exe6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("afhsdf");
        strings.add("shfhsdf");
        strings.add("asaaKFKFK");

       String newString = String.join(", ", strings);
        System.out.println(newString);

    }


}
