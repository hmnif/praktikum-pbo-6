public class For {
  private int Banyak;

  public For(int anakAyam) {
    this.Banyak = anakAyam;
  }

  public void Output() {
    System.out.println("Lagu anak ayam");

    System.out.println("\nAnak ayam turunlah berkotek");
    System.out.println("Anak ayam turunlah " + Banyak);
    for (int i = Banyak; i > 1; i--) {
      System.out.println("Mati satu tinggallah " + (i - 1));
      System.out.println("Tek kotek, kotek kotek");
    }

    System.out.println("Mati satu tinggal induknya");
  }
}
