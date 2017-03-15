public class Insercion {
  public static void ordenacion(Integer[] numeros) {
    for(int i = 1; i < numeros.length; i++){
      int value = numeros[i];
      int j = i - 1;

      while(j >= 0 && numeros[j] > value){
        numeros[j + 1] = numeros[j];
        j = j - 1;
      }
      numeros[j + 1] = value;
    }
  }
}
