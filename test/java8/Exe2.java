/*
package newwavesolution.java8;

import java.util.ArrayList;
import java.util.List;

public class Exe2 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(11);
        integers.add(28);
        integers.add(34);
        System.out.print("\nSum of even numbers: " + calculusEvenNumber(integers));
        System.out.print("\nSum of odd numbers: " + calculusOddNumber(integers));

    }

    public static int calculusEvenNumber(List<Integer> integers) {
        int sum = 0;
       List<Integer> evens = integers.stream().filter(number -> (number % 2 == 0)).toList();
       for (Integer element: evens) {
           sum += element;
       }
       return sum;
    }

    public static int calculusOddNumber(List<Integer> integers) {
        int sum = 0;
        List<Integer> odds = integers.stream().filter(number -> (number % 2 != 0)).toList();
        for (Integer element: odds) {
            sum += element;
        }
        return sum;
    }


}
*/
