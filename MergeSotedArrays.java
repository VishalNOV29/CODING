// class hello {
//     public static void main(String[] args){
//         hello obj=new hello();
//         int arr1[]={1,2,3,4,5};
//         int arr2[]={6,7,8,9};
//         int result[]=obj.merge(arr1, arr2, arr1.length, arr2.length);
//         // System.out.println(result.toString());
//         for (int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }

//     public int[] merge(int[] arr1, int[] arr2, int n1, int n2) {
//         int i = 0, j = 0, k = 0;
//         int arr3[] = new int[n1 + n2];
//         while (i < n1 && j < n2 ) {
//             if (arr1[i] < arr2[j]) {
//                 arr3[k] = arr1[i];
//                 i++;
//                 k++;
//             } else {
//                 arr3[k] = arr2[j];
//                 j++;
//                 k++;
//             }
//         }
//         while (i < n1) {
//             arr3[k] = arr1[i];
//             k++;
//             i++;
//         }
//         while (j < n2) {
//             arr3[k] = arr2[j];
//             k++;
//             j++;
//         }
//         return arr3;
//     }
// }