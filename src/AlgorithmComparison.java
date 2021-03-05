public class AlgorithmComparison {

    public static void main(String[] args) {
        int arr[] = new int[12000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        compareSortingAlgorithm(arr);
    }

    private static void compareSortingAlgorithm(int arr[]){
        compareTime(SortType.SELECTION, "SELECTION", arr);
        compareTime(SortType.INSERTION, "INSERTION", arr);
        //compareTime(SortType.MERGE, "MERGE", arr);
        compareTime(SortType.BUBBLE, "BUBBLE", arr);
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
            case MERGE:
                break;
            case BUBBLE:
                BubbleSort.sort(duplicateArr);
                break;
        }
        //debug(duplicateArr);
        System.out.println(sortName+ " SORT: " + stopwatch.elapsedTime());
    }



    public static void debug(int[] arr) {
        for(int i = 0; i< arr.length ; i++){
            System.out.println(arr[i]);
        }
    }


}
