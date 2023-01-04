import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      //Değişkenler belirlenir

      int aKenarı, bKenarı, xKenarı, yKenarı,zKenarı;
      double cHipotenüs,alan , cevre, u;

      Scanner input = new Scanner(System.in);
      // Kullanıcıdan bilgi girişi istiyoruz

      System.out.print("a Kenarının uzunluğunu giriniz :");
      aKenarı = input.nextInt();

      System.out.print("b Kenarının uzunluğunu giriniz :");
      bKenarı =input.nextInt();

      cHipotenüs = Math.sqrt((aKenarı*aKenarı)+(bKenarı*bKenarı));//java da Math.sqrt kullanarak bir sayının karekökünü alabiliriz.
      System.out.print("*Hipotenüsün Uzunluğu :" + (cHipotenüs));

        // Üçgende alan hesaplama :
        System.out.println("");
        //Kullanıcıdan bilgi alınır
        System.out.print("a Kenarının uzunluğunu giriniz :");
        xKenarı = input.nextInt();

        System.out.print("y Kenarının uzunluğunu giriniz :");
        yKenarı =input.nextInt();

        System.out.print("z Kenarının uzunluğunu giriniz :");
        zKenarı =input.nextInt();
        // Formül yazılır
        u = ((xKenarı+yKenarı+zKenarı)/2);
        cevre =(2*u);
        alan = Math.sqrt( u*(u - xKenarı)*(u - yKenarı)*(u - zKenarı));
        System.out.println("Üçgenin Çevresi :" +cevre);
        System.out.println("Üçgenin Alanı :" +alan);
    }
}
