//  IT TAKES 3 SECOND FOR 10 ITEMS. LOL
public class BogoSort extends SortingAlgorithms {
    public static void sort(int arr[]){
        while(!isSorted(arr))
            shuffle(arr);
    }

    private static void shuffle(int[] arr) {
        int x,y;
        for(int i = 0; i < arr.length ; i++){
            x = (int) (Math.random() * arr.length);
            y = (int) (Math.random() * arr.length);
            exchange(arr, x, y);
        }
    }

    private static boolean isSorted(int[] arr) {
        int prev = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (prev > arr[i])
                return false;
            prev = arr[i];
        }
        return true;
    }
}
