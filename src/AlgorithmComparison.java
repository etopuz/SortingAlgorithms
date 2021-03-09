public class AlgorithmComparison {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        compareSortingAlgorithm(arr);
    }

    private static void compareSortingAlgorithm(int arr[]){
        compareTime(SortType.SELECTION, "SELECTION", arr);
        compareTime(SortType.INSERTION, "INSERTION", arr);
        compareTime(SortType.BUBBLE, "BUBBLE", arr);
        compareTime(SortType.BETTER_SELECTION, "BETTER SELECTION", arr);
        //compareTime(SortType.BOGO, "BOGO", arr); IT TAKES SO MUCH TIME
        //compareTime(SortType.MERGE, "MERGE", arr); HAS BUGS NEEDS FIX
    }

    private static void compareTime(SortType sortType,String sortName,int arr[]){
        int[] duplicateArr = arr.clone();

        Stopwatch stopwatch = new Stopwatch();
        switch (sortType) {
            case SELECTION:
                SelectionSort.sort(duplicateArr);
                break;
            case INSERTION:
                InsertionSort.sort(duplicateArr);
                break;
            case MERGE:
                MergeSort.sort(duplicateArr,0, duplicateArr.length);
                break;
            case BUBBLE:
                BubbleSort.sort(duplicateArr);
                break;
            case BOGO:
                BogoSort.sort(duplicateArr);
                break;
            case BETTER_SELECTION:
                BetterSelectionSort.sort(duplicateArr);
                break;
        }

        System.out.println(sortName+ " SORT: " + stopwatch.elapsedTime());
        //debug(duplicateArr);
    }

    public static void debug(int[] arr) {
        for(int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }


}
