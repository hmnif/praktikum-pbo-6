import java.util.Scanner;

public class Lagu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan jumlah anak ayam : ");
    int anakAyam = input.nextInt();

    // Perulangan di kelas For
    For for1 = new For(anakAyam);
    for1.Output();

    // Perulangan dikelas While
    While while1 = new While(anakAyam);
    while1.Output();

    // Perulangan dikelas dowhike
    doWhile dowhile1 = new doWhile(anakAyam);
    dowhile1.Output();
  }
}
