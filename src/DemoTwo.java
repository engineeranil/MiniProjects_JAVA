import java.util.Scanner;

public class DemoTwo {
    static void demo(){
        Scanner scan = new Scanner(System.in);
        int faktoriyel = 1;
        System.out.println("Bir Sayi Giriniz :)");
        int numberOne = scan.nextInt();

        for(int i=1; i<=numberOne; i++){
            faktoriyel=faktoriyel*i;
            System.out.println(i+"!="+faktoriyel);
        }
    }


}
