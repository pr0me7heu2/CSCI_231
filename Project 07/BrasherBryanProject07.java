import java.util.*;

public class BrasherBryanProject07 {


    public static void main(String[] args) {
        // driver for methods below

        // create test array
        int[] array = new int[10];
        // new scanner object
        Scanner input = new Scanner(System.in);

        initializeArray(array);
        printArray(array);
        System.out.println("The smallest value is " + smallest(array) + " and th    e " +
                "largest value is " + largest(array) + ".");
        System.out.println("The range: " + range(array));
        System.out.println("The average value is: " + average(array));
        System.out.println("Enter a search key:");

        int result = linearSearch(array,input.nextInt());
        if (result > 0) {
            System.out.println("That key is at index " + result + ".");
        }
        else {
            System.out.println("That key is not in the array.");
        }

        System.out.println("Array sorted: ");
        selectSort(array);
        printArray(array);
    }

    // returns index of first occurrence of key in array arr
    // returns -1 if key does not exist in arr
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // select sort of array arr
    public static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // prints array elements to std out with 5 elements / line
    public	static	void printArray(int	arr[]){
        for (int i = 1; i < arr.length+1 ; i++) {
            System.out.print(arr[i-1] + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

    // generates value [1,100] for each element in array arr
    public	static void initializeArray(int	arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
        }
    }

    // returns range of array
    public	static int range(int arr[]) {
        return (largest(arr) - smallest(arr));
    }

    // returns largest int in array
    public static int largest(int arr[]) {
        int max = arr[0];
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    // returns smallest int in array
    public static int smallest(int arr[]) {
        int min = arr[0];
        for (int value : arr) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    // returns the average value of the array arr
    public static double average(int arr[]) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return (double)sum / arr.length;
    }
}