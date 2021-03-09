public class BetterSelectionSort extends SortingAlgorithms {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int minAndMax[] = findIndexOfMin(arr,i,n);
            int min = minAndMax[0];
            int max = minAndMax[1];
            exchange(arr, i, min);
            if(i == max)
                max = min;
            exchange(arr, n-1, max);
            n--;
        }
    }

    private static int[] findIndexOfMin(int[] arr, int start, int end){
        int indexOfMin = start;
        int indexOfMax = start;

        for(int j = start+1; j< end; j++) {
            if(arr[j] < arr[indexOfMin])
                indexOfMin = j;
            else if(arr[j] > arr[indexOfMax])
                indexOfMax = j;
        }

        return new int[] {indexOfMin, indexOfMax};
    }
}
