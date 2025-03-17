/*
package newwavesolution.java8;

import java.util.ArrayList;
import java.util.List;

public class Exe4 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(-4);
        integers.add(3);
        integers.add(1);
        integers.add(-3);
        integers.add(-8);
        findNumber(integers);
    }

    public static void findNumber(List<Integer> integers) {

        //Object[] array = integers.stream().sorted().toArray();
        List<Integer> integerList = integers.stream().distinct().sorted().toList();

        if (integerList.isEmpty()) {
            System.out.println("list empty");
        }
        else if (integerList.size() == 1) {
            System.out.println("list just have 1 element");
        }
        else if (integerList.size() == 2) {
            System.out.println("Second Smallest Number: " + integerList.get(0));
            System.out.println("Second Largest Number: " + integerList.get(0));
        }
        else {
            System.out.println("Second Smallest Number: " + integerList.get(1));
            System.out.println("Second Largest Number: " + integerList.get(integerList.size() - 2));
        }

        */
/*int secondSmallestNumber = integerList.size() > 1 ? integerList.get(1) : integerList.get(0);
        int secondLargestNumber = integerList.size() > 1 ? integerList.get(integerList.size() - 2) : integerList.get(0);
        System.out.println("Second Smallest Number: " + secondSmallestNumber);
        System.out.println("Second Largest Number: " + secondLargestNumber);*//*

    }
}
*/
