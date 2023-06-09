import java.util.Scanner;

public class MayinTarlasi {
    public static void main(String[] args) {
        System.out.println("MAYIN TARLASI OYUNUNA HOSGELDINIZ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir Sayisini Giriniz : ");
        int row = scan.nextInt();
        System.out.println("Sutun Sayisini Giriniz : ");
        int col = scan.nextInt();
        String[][] tarla = new String[row][col];
    }
}
