public class BubbleSort extends SortingAlgorithms{
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    exchange(arr, j , j+1);
                }
            }
        }
    }
}
