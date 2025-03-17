/*
package newwavesolution.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exe1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("b");
        strings.add("CAsfd");
        changeStringToLowerCase(strings);
        System.out.println("\n");
        changeStringToUpperCase(strings);

    }

    public static void changeStringToUpperCase(List<String> strings) {
        List<String> stringUpperCase = strings.stream().map(String::toUpperCase).toList();
        System.out.println(String.join(" ", stringUpperCase));

    }

    public static void changeStringToLowerCase(List<String> strings) {
        List<String> stringLowerCase = strings.stream().map(String::toLowerCase).toList();
        System.out.println(String.join(" ", stringLowerCase));
    }
}
*/
