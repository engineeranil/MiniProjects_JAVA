import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int a = 0;
        int result = 0;
        int[] list = new int[]{1,3,a,5};
        int[] listTwo = new int[]{2};
        list[2]=listTwo[0];

        Arrays.sort(list);

         result = (list.length)/2;

        System.out.println(list[result]);
    }
}
