public class doWhile {
  private int Banyak;

  public doWhile(int anakAyam) {
    this.Banyak = anakAyam;
  }

  public void Output() {
    System.out.println("Lagu anak ayam");

    System.out.println("\nAnak ayam turunlah berkotek");
    System.out.println("Anak ayam turunlah " + Banyak);

    int i = Banyak;
    do {
      System.out.println("Mati satu tinggallah " + (i - 1));
      System.out.println("Tek kotek, kotek kotek");
      i--;
    } while (i > 1);

    System.out.println("Mati satu tinggal induknya");
  }
}
