import java.util.Arrays;
import java.util.Scanner;

public class RandomSayı {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        int right = 0;
        int selected;
        boolean isWrong = false;
        boolean isWin = true;
        int[] wrong = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println(number);
        System.out.println("SAYI BULMACA OYUNUNA HOSGELDINIZ...");
        while(right<5){

            System.out.println("Tahmin ettiginiz sayiyi giriniz :");
            selected= scan.nextInt();
            if(selected<0 || selected>100){
                System.out.println("Yanlis bir sayi girdiniz");
                if(!isWrong){
                    isWrong=true;
                    System.out.println("TEKRAR HATALI BIR SAYI GIRERSENIZ KALAN HAKKINIZDAN DUSURULECEKTIR");
                }
                else{
                    right++;
                    System.out.println("Kalan Hak : "+(5-right));
                }

                continue;
            }
            if(selected==number){
                isWin=false;
                System.out.println("Tebrikler :) ");

                break;
            }
            if(selected<number){
                System.out.println("Gizli sayidan daha buyuk bir deger giriniz :)");
                wrong[right]=selected;
            }
            else{
                System.out.println("Gizli sayidan daha kucuk bir deger giriniz :)");
                wrong[right]=selected;
            }

            right++;
            System.out.println("Kalan hakkiniz : "+(5-right));
        }

        System.out.println("Tahmin Ettiginiz Sayilar "+ Arrays.toString(wrong));
        if(isWin){

                System.out.println("Kaybettiniz :(");
        }
    }
}
