package basic.dev;
import java.util.Random;
public class MainApp {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a[] = new int[10];

    input(a);
    print(a);
    tongCuaMang(a);
    soNguyenTo(a);
    soPolimom(a);
  }

  private static void soPolimom(int[] a) {
    // TODO Auto-generated method stub
    int temp = 0;
    for (int i = 0; i < a.length; i++) {
      if (daonguoc(a[i]))
        temp++;
    }

    System.out.format("- mảng có %d số Polimom ", temp).println();
  }

  private static void soNguyenTo(int[] a) {
    // TODO Auto-generated method stub
    int dem = 0;
    for (int i = 0; i < a.length; i++) {
      if (isPrimary(a[i]))
        dem++;
    }
    System.out.format("- mảng có  %d số nguyên tố ", dem).println();
  }

  private static void tongCuaMang(int[] a) {
    // TODO Auto-generated method stub
    int tong = 0;
    for (int i = 0; i < a.length; i++) {
      tong = tong + a[i];
    }
    System.out.println(" Tổng của mảng = " + tong);
  }

  private static void print(int[] a) {
    // TODO Auto-generated method stub
    System.out.println("\n- Mảng a:\t ");
    for (int i = 0; i < a.length; i++) {
      System.out.format("%d", a[i]).print(" \t ");

    }
  }

  private static void input(int[] a) {
    // TODO Auto-generated method stub
    int min = 100;
    int max = 1000;
    for (int i = 0; i < a.length; i++) {
      a[i] = randomInteger(min, max);
    }
  }
  private static int randomInteger(int min, int max) {
    Random rand = new Random();
    return rand.nextInt(max + 1 - min) + min;
  }
  static boolean isPrimary(int n) {
    if (n == 1 || n == 2) return true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) return false;
    }
    return true;

  }

  static boolean daonguoc(int n) {
    int n1;
    int temp = 0;
    n1 = n;
    while (n != 0) {
      temp = n % 10 + temp * 10;
      n /= 10;
      if (n1 == temp) return true;
    }

    return false;
  }
}