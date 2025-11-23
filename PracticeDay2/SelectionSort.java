public class SelectionSort {
        public static void main(String[] args) {
            int arr[] = {6,5,2,8,9,4};
            int size = arr.length;
            int temp;
            System.out.println("------------------before sorting");
            for(int l:arr){
                System.out.print(l + " ");
            }
            System.out.println("\n------------------after sorting");

            for(int i = 0; i<size; i++){
                int minimumValue = arr[i];
                int indexOfMinimum = i;
                for(int j = i+1; j<size-1; j++){
                    if(arr[j]<minimumValue){
                        minimumValue = arr[j];
                        indexOfMinimum = j;
                    }
                }
                temp = arr[i];
                arr[i] = arr[indexOfMinimum];
                arr[indexOfMinimum] = temp;
            }

            for(int k:arr){
                System.out.print(k + " ");
            }
        }
}
