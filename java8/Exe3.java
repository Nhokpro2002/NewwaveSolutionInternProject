package newwavesolution.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exe3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("E");
        strings.add("A");
        strings.add("C");
        strings.add("B");
        //strings.add("E");
        sortByAscendingAlphabeticalOrder(strings);
        sortByDescendingAlphabeticalOrder(strings);
    }

    public static void sortByAscendingAlphabeticalOrder(List<String> strings) {
        List<String> ascendingStrings = strings.stream().sorted().toList();
        System.out.println(String.join(" ", ascendingStrings));
    }

    public static void sortByDescendingAlphabeticalOrder(List<String> strings) {
        List<String> descendingStrings = strings.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(String.join(" ", descendingStrings));
    }
}
