public class ganjilgenapMain {
  public static void main(String[] args) {
    For perulanganFor = new For();
    doWhile dowhile = new doWhile();
    While while1 = new While();

    System.out.println("\nPerulangan For");
    perulanganFor.ganjil(0, 20);
    perulanganFor.genap(0, 20);

    System.out.println();

    System.out.println("Perulangan While");
    while1.ganjil(0, 20);
    while1.genap(0, 20);

    System.out.println();

    System.out.println("\nPerulangan Do-While");
    dowhile.ganjil(0, 20);
    dowhile.genap(0, 20);
  }
}
