public class pruebagit2 {
  public static void main(String[] args) {

    int[] elementos = InsertarNumerosArray();

    Contador(elementos);

  }

  public static void Contador(int[] array) {
   
    for (int i = 1; i < 11; i++) {
      int contador = 0;
      for (int j = 0; j < array.length; j++) {
        if (array[j] == i) {
          contador++;
        }
      }
      System.out.println("El numero " + i + " se repite " + contador + " veces");
    }
  }

  public static int[] InsertarNumerosArray() {
    int[] array = new int[30];
    for (int i = 0; i < array.length; i++) {

      array[i] = (int) (Math.random() * 10 + 1);

    }
    return array;

  }
}