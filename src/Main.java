import java.util.Scanner;

//videodaki örnek
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        int ebob = 1;
        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob : " + ebob);
                break;
            }
        }
        //ekok işlemi
        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Ekok : " + i);
                break;
            }
        }
        System.out.println("Videodaki formülle ekok : " + (n1 * n2) / ebob);

        /**
         * int ebob = 1;

         //ebob için 1. alternatif
         for(int i = 1; i <= n1; i++){
         if(n1 % i == 0 && n2 % i == 0)
         System.out.println(i);
         ebob = i;
         }
         //1. alternatifin çıktısı

         1
         2
         3
         6
         System.out.println("============");

         //ebob için 2. alternatif
         for(int k = n1; k >= 1; k-- ){
         if(n1 % k == 0 && n2 % k == 0){
         ebob = k;
         System.out.println(ebob);
         break;
         }
         }
         //2. alternatifin çıktısı
         // 6
         */

    }
}