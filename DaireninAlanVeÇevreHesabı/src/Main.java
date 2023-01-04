import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// Değişkenleri belirliyoruz
        double alan, cevre, pi=3.14, daireAlan;
        int r ,yarıcap, merkezAcı = 1; // merkezAcı= alfa değerine eşittir.
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz :");
        r = input.nextInt();
        alan =Math.PI*r*r;
        cevre =Math.PI*2*r;
        System.out.println("Dairenin Alanı :" +alan);
        System.out.println("Dairenin Çevresi :" +cevre);

        // Bir Daire Diliminin Alanı
        System.out.println();
        System.out.print("Daire Diliminin Yarıçapını Giriniz :");
        yarıcap=input.nextInt();
        daireAlan = (pi * (yarıcap * yarıcap) * merkezAcı) / 360;
        System.out.println("Daire Diliminin Alanı :" +daireAlan);
    }
}
