import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //değişkenler belirlenir
        int mat, fizik, kimya, turkçe;
        double avarage;
        //scanner sınıfı tanımlanır
        Scanner input = new Scanner(System.in);

            System.out.print("Matematik notunuzu giriniz :");
            mat = input.nextInt();

            System.out.print("Fizik notunuzu giriniz :");
            fizik = input.nextInt();

            System.out.print("Kimya notunuzu giriniz :");
            kimya = input.nextInt();

            System.out.print("Türkçe notunuzu giriniz :");
            turkçe = input.nextInt();
            //Girilen notların 0 ile 100 arasında olmasını istiyoruz ve aşağıdaki gibi koşul oluşturuyoruz.
            if ((mat >= 0 && mat <= 100) && (turkçe >= 0 && turkçe <= 100) &&
               (fizik >= 0 && fizik <= 100) && (kimya >= 0 && kimya <= 100)){

                avarage = (mat + turkçe + fizik + kimya) / 4;    //ortalama formulü.

                System.out.println("Geçme Notu : 55 ");
                System.out.println("Ortalamanız : " + avarage);

                if (avarage < 55) {
                    System.out.println("Sınıfta Kaldınız, Geçmiş olsun.");
                } else {
                    System.out.println("Sınıfı Geçtiniz, Tebrikler.");
                }
            } else{ //eğer girilen not değeri belirlediğimiz aralıkta değilse kullanıcıya uyarı verecek kodu yazıyoruz.
                System.out.println("Ortalamanız hesaplanmadı!\nNotlarınız 0 ile 100 aralığında olmalıdır.");
            }
        }
    }