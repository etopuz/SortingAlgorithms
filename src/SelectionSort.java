public class SelectionSort extends SortingAlgorithms
{
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            exchange(arr, i, findIndexOfMin(arr,i));
        }
    }

    public static int findIndexOfMin(int[] arr, int start){
        int indexOfMin = start;
        for(int j = start+1; j< arr.length; j++) {
            if(arr[j] < arr[indexOfMin])
                indexOfMin = j;
        }
        return indexOfMin;
    }
}
