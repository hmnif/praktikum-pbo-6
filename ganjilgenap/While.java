public class While {
  public void ganjil(int nAwal, int nAkhir) {
    System.out.println("Bilangan ganjil:");
    int i = nAwal;
    while (i <= nAkhir) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
      i++;
    }
  }

  public void genap(int nAwal, int nAkhir) {
    System.out.println("\nBilangan genap:");
    int i = nAwal;
    while (i <= nAkhir) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
      i++;
    }
  }
}
