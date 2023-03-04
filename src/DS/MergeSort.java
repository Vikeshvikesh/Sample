package DS;

import java.util.Arrays;

public class MergeSort {
    void merge(int array[], int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }
    void mergeSort(int array[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, h);
            merge(array, l, mid, h);
        }
    }

    public static void main(String args[]) {
        int[] array = { 6, 5, 12, 10, 9, 1 };

        MergeSort ob = new MergeSort();
        ob.mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }
}
