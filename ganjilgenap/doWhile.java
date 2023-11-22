public class doWhile {
  // int nAwal, nAkhir;

  public void ganjil(int nAwal, int nAkhir) {
    System.out.println("Bilangan ganjil:");
    int i = nAwal;
    do {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
      i++;
    } while (i <= nAkhir);
  }

  public void genap(int nAwal, int nAkhir) {
    System.out.println("\nBilangan genap:");
    int i = nAwal;
    do {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
      i++;
    } while (i <= nAkhir);
  }
}
