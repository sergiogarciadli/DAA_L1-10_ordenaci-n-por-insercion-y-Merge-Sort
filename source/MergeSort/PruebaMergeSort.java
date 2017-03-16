public class PruebaMergeSort {
 public static void main(String args[]) {
   Integer[] numbers = new Integer[3];

   //System.out.println(numbers.length);
   for (int i = numbers.length - 1; i >= 0; i--) {
     numbers[i] = i;
   }

   String aux = "";
   for(int i = 0; i < numbers.length; i++) {
     aux += numbers[i];
   }
   System.out.println(aux); aux = "";

   double startTime = System.nanoTime();
   MergeSort.mergesort(numbers, 0, numbers.length - 1);
   double endTime = System.nanoTime();

   double resta = endTime - startTime;
   System.out.println("El tiempo de ejecución fue: " + resta);

   for(int i = 0; i < numbers.length; i++) {
     aux += numbers[i];
   }
   System.out.println(aux);
 }
}
