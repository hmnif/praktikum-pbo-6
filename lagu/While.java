public class While {
  private int Banyak;

  public While(int anakAyam) {
    this.Banyak = anakAyam;
  }

  public void Output() {
    System.out.println("Lagu anak ayam");

    System.out.println("\nAnak ayam turunlah berkotek");
    System.out.println("Anak ayam turunlah " + Banyak);

    int i = Banyak;
    while (i > 1) {
      System.out.println("Mati satu tinggallah " + (i - 1));
      System.out.println("Tek kotek, kotek kotek");
      i--;
    }

    System.out.println("Mati satu tinggal induknya");
  }
}
