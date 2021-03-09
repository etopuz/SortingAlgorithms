public class MergeSort {
    static void sort(int arr[], int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int arr[], int left, int mid, int right) {

        int leftArraySize = mid - left + 1;
        int rightArraySize = right - mid;

        int leftArray[] = new int[leftArraySize];
        int rightArray[] = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < rightArraySize; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = left;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArraySize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArraySize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
