public class alphabetReverse {
  public static void main(String[] args) {
    System.out.println("Perulangan for:");
    for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
      System.out.print(huruf + " ");
    }
    System.out.println();

    System.out.println("\nPerulangan while:");
    char hurufWhile = 'Z';
    while (hurufWhile >= 'A') {
      System.out.print(hurufWhile + " ");
      hurufWhile--;
    }
    System.out.println();

    System.out.println("\nPerulangan do-while:");
    char hurufDoWhile = 'Z';
    do {
      System.out.print(hurufDoWhile + " ");
      hurufDoWhile--;
    } while (hurufDoWhile >= 'A');
    System.out.println();
  }
}