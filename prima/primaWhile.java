public class primaWhile {
  public static void main(String[] args) {
    int maks = 20;
    int i = 2;

    System.out.println("Cetak bilangan prima");

    while (i <= maks) {
      if (isPrima(i)) {
        System.out.print(i + " ");
      }
      i++;
    }

    System.out.println("\nBukan bilangan prima");
    i = 2;
    while (i <= maks) {
      if (!isPrima(i)) {
        System.out.print(i + " ");
      }
      i++;
    }
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
