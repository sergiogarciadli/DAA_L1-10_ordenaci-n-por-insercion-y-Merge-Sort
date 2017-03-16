import java.util.Arrays;
import java.util.ArrayList;

public class PruebaInsercion {
  public static void main(String args[]) {
    Integer[] numbers = new Integer[]{5, 1, 8, 4, 7, 9, 7, 5, 1, 8, 4, 7, 9, 7};

    //System.out.println("La secuencia antes de la ordenación es: " + numbers);
    double startTime = System.nanoTime();
    Insercion.ordenacion(numbers);
    double endTime = System.nanoTime();

    double resta = endTime - startTime;
    System.out.println("El tiempo de ejecución fue: " + resta);
    //System.out.println("La secuencia después de la ordenación es: " + numbers);
  }
}
