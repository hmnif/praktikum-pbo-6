public class primaFor {
  public static void main(String[] args) {
    int maks = 20;

    System.out.println("Cetak bilangan prima");
    for (int i = 2; i <= maks; i++) {
      if (isPrima(i)) {
        System.out.print(i + " ");
      }
    }

    System.out.println("\nBukan bilangan prima");
    for (int i = 2; i <= maks; i++) {
      if (!isPrima(i)) {
        System.out.print(i + " ");
      }
    }

  }

  public static boolean isPrima(int i) {
    for (int j = 2; j < i; j++) {
      if (i % j == 0) {
        return false;
      }
    }
    return true;
  }

}
