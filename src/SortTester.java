import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    /*
    int[] arr1 = {100, 94, 98, 83, 72, -5, -10, -43, -81, -54, -2, 1, 2, 3, 5, 6, 7}
            ;
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 

    int[] arr2 = {100, 94, 98, 83, 72, -5, -10, -43, -81, -54, -2, 1, 2, 3, 5, 6, 7}
            ;
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
    */

    /*
    int[] arr1 = {100, 94, 98, 83, 72, -5, -10, -43, -81, -54, -2, 1, 2, 3, 5, 6, 7};
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));
    int[] arr2 = {23, 43, 12, 65, 76, 54, 87, 17, 12, 46, 26, 72, 9, 3, 61};
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));
    */

    int[] arr3 = {1, 3, 5, 7, 9, 8, 6, 4, 2, 54, 23, 12, 76};
    Sort.selectionSortDescending(arr3);
    System.out.println(Arrays.toString(arr3));
    int[] arr4 = {1, 3, 5, 7, 9, 8, 6, 4, 2, 54, 23, 12, 76};
    Sort.insertionSortDescending(arr4);
    System.out.println(Arrays.toString(arr4));
  }
}
