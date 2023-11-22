public class For {
  public void ganjil(int nAwal, int nAkhir) {
    System.out.println("Bilangan ganjil:");
    for (int i = nAwal; i <= nAkhir; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
  }

  public void genap(int nAwal, int nAkhir) {
    System.out.println("\nBilangan genap:");
    for (int i = nAwal; i <= nAkhir; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
