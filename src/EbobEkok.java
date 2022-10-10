import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 >= 1 && n2 >= 1) {
            int i = 1, ebob = 1;
            while (i <= n1) {
                i++;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Ebob: " + ebob);

            int ekok;
            ekok = (n1 * n2) / ebob;
            System.out.print("Ekok " + ekok);


        } else {
            System.out.println("Hatalı giriş yaptınız. Pozitif sayı giriniz. ");
        }

    }
}