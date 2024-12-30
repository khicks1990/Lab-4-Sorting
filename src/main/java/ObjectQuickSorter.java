/**
   The ObjectQuickSorter class provides a public static
   method for performing a QuickSort on an array of
   Comparable objects.
*/

public class ObjectQuickSorter
{
  /**
      The quickSort method calls the doQuickSort method
      to sort an array of Comparable objects.
      @param array The array to sort.
   */

   public static void quickSort(Comparable array[])
   {
      doQuickSort(array, 0, array.length - 1);
   }

   /**
      The doQuickSort method uses the QuickSort algorithm
      to sort an array of Comparable objects.
      @param array The array to sort.
      @param start The starting subscript of the list to sort
      @param end The ending subscript of the list to sort
   */

   private static void doQuickSort(Comparable array[], 
                                   int start, int end)
   {

   }

   /**
      The partition method selects a pivot value in an array
      and arranges the array into two sub lists. All the
      values less than the pivot will be stored in the left
      sub list and all the values greater than or equal to
      the pivot will be stored in the right sub list.
      @param array The array to partition.
      @param start The starting subscript of the area to partition.
      @param end The ending subscript of the area to partition.
      @return The subscript of the pivot value.
   */

   private static int partition(Comparable array[], 
                                int start, int end)
   {

   }

   /**
      The swap method swaps the contents of two elements
      in an array of Comparable objects.
      @param The array containing the two elements.
      @param a The subscript of the first element.
      @param b The subscript of the second element.
   */

   private static void swap(Comparable[] array, int a, int b)
   {

   }
}
