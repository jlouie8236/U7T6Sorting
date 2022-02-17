import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {100, 94, 98, 83, 72, -5, -10, -43, -81, -54, -2, 1, 2, 3, 5, 6, 7}
            ;
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {100, 94, 98, 83, 72, -5, -10, -43, -81, -54, -2, 1, 2, 3, 5, 6, 7}
            ;
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
