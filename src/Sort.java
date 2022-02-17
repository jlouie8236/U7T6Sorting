import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int counter = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {

      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {      
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;

        }
        counter++;
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Number of iterations: " + counter);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int counter = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {     
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
        counter++;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Number of iterations: " + counter);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int counter = 0;
    for (int i = 0; i < words.size() - 1; i++)
    {
      int minIndex = i;
      for (int j = i + 1; j < words.size(); j++)
      {
        if (words.get(j).compareTo(words.get(minIndex)) < 0)
        {
          minIndex = j;
        }
        counter++;
      }
      String temp = words.get(i);
      words.set(i, words.get(minIndex));
      words.set(minIndex, temp);
    }
    System.out.println("Number of iterations: " + counter);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {
    int counter = 0;
    for (int i = 1; i < words.size(); i++)
    {
      String temp = words.get(i);
      int possible = i;
      while (possible > 0 && temp.compareTo(words.get(possible - 1)) < 0)
      {
        words.set(possible, words.get(possible - 1));
        possible--;
        counter++;
      }
      words.set(possible, temp);
    }
    System.out.println("Number of iterations: " + counter);
  }
}