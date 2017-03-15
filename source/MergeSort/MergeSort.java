public class MergeSort {
  public static void mergesort(Integer[] numeros, int izq, int der){
    if (izq < der){
      int m = (izq + der) / 2;
      mergesort(numeros, izq, m);
      mergesort(numeros, m + 1, der);
      merge(numeros, izq, m, der);
    }
  }

  public static void merge(Integer[] numeros, int izq, int m, int der){
    int i, j, k;

    Integer[] auxiliar = new Integer[numeros.length]; //array auxiliar

    for (i = izq; i <= der; i++) //copia ambas mitades en el array auxiliar
      auxiliar[i] = numeros[i];

    i = izq; j = m + 1; k = izq;

    while (i <= m && j <= der) //copia el siguiente elemento más grande
      if (auxiliar[i] <= auxiliar[j])
        numeros[k++] = auxiliar[i++];

      else
        numeros[k++] = auxiliar[j++];

    while (i <= m) //copia los elementos que quedan de la
      numeros[k++] = auxiliar[i++]; //primera mitad (si los hay)
 }
}
