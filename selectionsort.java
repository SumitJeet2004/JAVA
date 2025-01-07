import java.util.*;

public class selectionsort {
    public static void selectionsorting(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minpos = turn;
            // Find the minimum element in the unsorted part of the array
            for (int i = turn + 1; i < arr.length; i++) {
                if (arr[minpos] > arr[i]) {
                    minpos = i;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minpos];
            arr[minpos] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // To move to the next line after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        selectionsorting(arr);
        printArray(arr);
    }
}
