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
  }

  public static boolean isPrima(int i) {
    if (i <= 1) {
      return false;
    }

    int j = 2;

    do {
      if (i % j == 0) {
        return false;
      }
      j++;
    } while (j < i);

    return true;
  }
}
