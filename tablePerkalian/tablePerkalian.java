import java.util.Scanner;

public class tablePerkalian {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai n : ");
    int n = input.nextInt();

    System.out.println("Tabel Perkalian " + n + " x " + n);

    System.out.print("\t");
    for (int i = 1; i <= n; i++) {
      System.out.print(i + "\t");
    }
    System.out.println();

    for (int i = 1; i <= n; i++) {
      System.out.print(i + "\t");
      for (int j = 1; j <= n; j++) {
        System.out.print(i * j + "\t");
      }
      System.out.println();
    }
  }
}