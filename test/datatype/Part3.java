/*
package hus.datatype;

import java.util.ArrayList;
import java.util.List;

public class Part3 {

    public static void main(String[] args) {

        bubbleSort(844563126);
        selectionSort(844563126);
    }

    public static void bubbleSort(long numberInteger) {
        // code program revice input (int number)
        // chuyen thanh mot chuoi chu so nguyen va phan tich no
        int[] array = createArray(numberInteger);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int index : array) {
            System.out.println(index);
        }

    }

    public static void selectionSort(long numberInteger) {
        int[] array = createArray(numberInteger);
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int index : array) {
            System.out.print(index + " ");
        }
    }

    public static int[] createArray(long numberInteger) {
        long initNumber = numberInteger;
        int count = 0;
        while (initNumber != 0) {
            int residual = (int) initNumber % 10;
            ++count;
            initNumber /= 10;
        }

        int[] arrayInteger = new int[count];
        for (int i = arrayInteger.length - 1; i >= 0; i--) {
            arrayInteger[i] = (int) numberInteger % 10;
            numberInteger /= 10;
        }
        return arrayInteger;
    }
}
*/
