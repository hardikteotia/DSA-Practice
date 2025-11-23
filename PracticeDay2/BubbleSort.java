public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2, 6, 1, 9,5, 4};
        System.out.println("Before Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Sort the array
        bubbleSort(arr);

        System.out.println();
        System.out.println("After Sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int count = 0;
        int size =  arr.length;
        for(int i = 0; i<size;i++){
            for(int j = 0; j<size-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;                }
            }
            // System.out.println(i);
            // for (int k : arr) {
            //     System.out.print(k + " ");
            // }
            // System.out.println("/n count: "+ count);
        }

    }

}
