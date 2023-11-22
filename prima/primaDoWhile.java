public class primaDoWhile {
  public static void main(String[] args) {
    int maks = 20;
    int i = 2;

    System.out.println("Cetak bilangan prima");
    do {
      if (isPrima(i)) {
        System.out.print(i + " ");
      }
      i++;
    } while (i <= maks);

    System.out.println("\nBukan bilangan prima");
    i = 2;
    do {
      if (!isPrima(i)) {
        System.out.print(i + " ");
      }
      i++;
    } while (i <= maks);
  }

  public static boolean isPrima(int angka) {
    if (angka <= 1) {
      return false;
    }

    int j = 2;

    do {
      if (angka % j == 0) {
        return false;
      }
      j++;
    } while (j < angka);

    return true;
  }
}
