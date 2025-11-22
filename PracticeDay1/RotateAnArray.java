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

        System.out.println("\nbefore rotation");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nafter rotation");
        // reverseAnArray(arr);
        // rotateArray(arr);
        for(int i = 0; i<k; i++){
            rotateArray(arr);
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        
        System.out.println("end");
    }    

    static void rotateArray(int[] arr){
        //arr = [1, 2, 3, 4, 5]
        int temp;
        int i=arr.length-1;
        temp=arr[i];
        while(i>0){
            arr[i]=arr[i-1];
            i--;
        }
        arr[0]=temp; 
    }
    
}
