import java.util.Scanner;
public class MineSweeper{
    static void run(){
        System.out.println("MAYIN TARLASI OYUNUNA HOSGELDINIZ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir Sayisini Giriniz : ");
        int row = scan.nextInt();
        System.out.println("Sutun Sayisini Giriniz : ");
        int col = scan.nextInt();
        String[][] tarla = new String[row][col];
        int mayinSayisi = (row*col)/4;
        int[][] mayinKonumu = new int[4][3];

        for(int i = 0; i<mayinKonumu.length; i++){
            for(int j = 0; j<mayinKonumu[0].length; j++){
                mayinKonumu[i][j]=mayinSayisi;
            }
        }
    }

}
