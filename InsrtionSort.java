
class InsertionSort {
    // Creating a method that will take a array as a argument and sort it .
    void insertionSort(int array[]) {
        int size = array.length; // storing the size of array in size variable.
        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }
    // Driver code
    public static void main(String args[]) {
        int[] data1 = { 9, 5, 1, 4, 3, 2, 8, 6, 7 }; // array of randomly generated number.
        int[] data2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // array of numbers in ascending order.
        int[] data3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // array of numbers in descending order.
        InsertionSort is = new InsertionSort(); // creating object of InsertionSort class.
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis()); 
        is.insertionSort(data1); // calling the method for first array.
        System.out.print("After first exection Time in milliseconds = ");
        System.out.println(System.currentTimeMillis()); 
        is.insertionSort(data2); // calling the method for second array.
        System.out.print("After second execution Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        is.insertionSort(data3); // calling the method for third array.
        System.out.print("After third execution Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        
    }
}