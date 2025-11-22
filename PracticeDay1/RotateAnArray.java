/*Statement : Given an array and a number k, rotate the array to the right by k steps. 

Note: k can be larger than array length.
-----------------------------------------

arr = [1, 2, 3, 4, 5], k = 2
Result: [4, 5, 1, 2, 3] 
*/


public class RotateAnArray {
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        int k = 2;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (int i : arr) {
            System.out.println(i);
        }


    }    
}
