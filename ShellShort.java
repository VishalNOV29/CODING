import java.util.Arrays;

public class ShellShort {
    public void swap(int a, int b) {
        int x = a;
        a = b;
        b = x;
    }

    public int[] shellShort(int[] arr) {
        int gap = Math.floorDiv(arr.length, 2);
        for (int g = gap; g >= 1; g = Math.floorDiv(g, 2)) {
            for (int j = gap; j < arr.length; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i + gap] < arr[i]) {
                        int x = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = x;
                    } else {
                        break;
                    }

                }
            }
            
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 4, 5, 6, 3, 2, 1 };
        ShellShort obj = new ShellShort();
        int newArr[] = obj.shellShort(arr);
        System.out.println("unsorted array =" + Arrays.toString(arr));
        System.out.println("sorted array =" + Arrays.toString(newArr));
    }

}
