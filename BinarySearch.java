import java.util.Scanner;
// import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args){
        System.out.print("Enter the elements separated by space: ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.print("Enter the position of the element you want to search: ");
        int ele=sc.nextInt();
        sc.close();
        String numbers[]=input.split(" ");
        int myArr[]=new int[numbers.length];
        for (int i=0;i<numbers.length;i++){
            myArr[i]=Integer.parseInt(numbers[i]);
        }
        int low=0, high=myArr.length, mid=Math.floorDiv(low+high, 2);
        int check=0;
        while(low<=high){
            if (ele==myArr[mid]){
                System.out.print("Element found at index "+mid);
                check=1;
                break;
            }
            else if(ele<myArr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
            mid=Math.floorDiv(low+high, 2);
        }
        if (check==0){
            System.out.print("Element doesn't exist in element");
        }



    }
}
