import java.util.Arrays;
import java.util.ArrayList;

public class PruebaInsercion {
  public static void main(String args[]) {
    Integer[] numbers = new Integer[]{5, 1, 8, 5, 3, 9, 7, 4, 2, 1};

    System.out.println("La secuencia antes de la ordenación es: " + numbers);
    Insercion.ordenacion(numbers);
    System.out.println("La secuencia después de la ordenación es: " + numbers);
  }
}
