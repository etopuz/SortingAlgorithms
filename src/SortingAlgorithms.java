public class SortingAlgorithms {

    public static void debug(int[] arr) {
        for(int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }

    public static void exchange(int[]arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}
