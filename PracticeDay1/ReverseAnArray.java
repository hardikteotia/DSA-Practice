/*Problem 1 : Reverse Array In-Place
----------------------------------
Statement : Given an integer array, reverse it in-place (without using extra space for another array).
----------------------------------
arr = [1, 2, 3, 4, 5]*/

class ReverseAnArray{
    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        int temp;
        int i = 0, j=arr.length-1;

        while (i<j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int k : arr) {
            System.out.println(k);
        }
    }
}
