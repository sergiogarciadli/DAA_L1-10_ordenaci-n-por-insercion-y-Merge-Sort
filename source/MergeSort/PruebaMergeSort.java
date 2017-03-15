public class PruebaMergeSort {
 public static void main(String args[]) {
   Integer[] numbers = new Integer[]{5, 1, 8, 5, 3, 9, 7, 4, 2, 1};

   String aux = "";
   for(int i = 0; i < numbers.length; i++) {
     aux += numbers[i];
   }
   System.out.println(aux); aux = "";

   MergeSort.mergesort(numbers, 0, numbers.length - 1);

   for(int i = 0; i < numbers.length; i++) {
     aux += numbers[i];
   }
   System.out.println(aux);
 }
}
