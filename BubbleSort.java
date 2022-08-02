import java.util.Scanner;
public class BubbleSort {
    public void bubbleSort(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        int mid=Math.floorDiv(low+high, 2);
        int check=0;
        while (low<=high){
            if (arr[mid]==k){
                System.out.println("Element found at index "+mid);
                check=1;
                break;
            }else{
                if (k>mid){
                    low=mid+1;
                    mid=Math.floorDiv(low+high, 1);
                }
                else{
                    high=mid-1;
                    mid=Math.floorDiv(low+high, 2);
                }
            }
        }
        if (check==0){
            System.out.println("Element not found.");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        String input=sc.nextLine();
        String numbers[]=input.split(" ");
        int arr[]=new int[numbers.length];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(numbers[i]);
        }
        System.out.print("Enter the key to search : ");
        int k=sc.nextInt();
        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(arr, k);
        sc.close();
    }
}
