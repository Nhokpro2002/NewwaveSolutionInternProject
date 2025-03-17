/*
package newwavesolution.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exe5 {

    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        List<String> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenedList);

        Map<Integer, List<String>> groupedByLength = flattenedList.stream()
                .collect(Collectors.groupingBy(String::length));

        groupedByLength.forEach((length, list) ->
                System.out.println("Length " + length + ": " + list));

    }
}
*/
