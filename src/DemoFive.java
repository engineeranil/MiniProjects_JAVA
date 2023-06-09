import java.util.Scanner;

public class DemoFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak Sayisini Giriniz :) ");
        int basamakSayisi = scan.nextInt();

        for(int i = 0; i<=basamakSayisi; i++){
            for(int j=0; j<(basamakSayisi-i); j++){
                System.out.print("  ");
            }

            for(int m=1; m<=(2*i+1); m++){
                System.out.print("*");
            }

        System.out.println();

        }

    }
}
