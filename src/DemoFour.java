import java.util.Arrays;

public class DemoFour {
    public static void main(String[] args) {
        int numberOne=18;
        int numberTwo=24;
        int[] list = new int[6];
        int[] list2 = new int[8];
        int[] ebob = new int[4];
        int sayi=0;
       for(int i = 1; i<=numberOne; i++) {
           int result = numberOne / i;
           if (numberOne % i == 0) {
               list[sayi++] = result;
           }

       }
       int sayitwo=0;
       for (int j = 1 ; j<=numberTwo; j++) {
           int resulttwo = numberTwo/j;
           if (numberTwo%j==0){
               list2[sayitwo++]=resulttwo;
           }
       }
        System.out.println("18'in bolenleri : " + Arrays.toString(list));
       System.out.println("24'un bolenleri : "+Arrays.toString(list2));

       for(int i =0; i< ebob.length; i++){
           for(int j = 0;j>1;){

           }
       }

    }

}
