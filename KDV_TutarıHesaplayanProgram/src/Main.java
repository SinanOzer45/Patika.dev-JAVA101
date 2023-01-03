import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // KDV değerimizi tanımlıyoruz // Değişkenimiz
        double girilenFiyat;     //double kdvsizFiyat, kdvDegeri=18.0, şeklinde de yazabilirdik. // 16. satırda double da yazabiliriz.

        //Scanner sınıfını tanımlıyoruz // buradaki input nesne
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bilgi almak için öncelikle bir giriş veriyoruz
        System.out.print("Fiyat girin :");

        girilenFiyat = input.nextDouble();    // burayı yukarda değişken bölümünde double ın içine kdvsizFiyatı taanımlayabilirdik (kdvsizFiyat = input.nextDouble(); şeklinde olurdu.)

        // Miktar aralığına göre KDV hesabı

        boolean yuksekOran = (girilenFiyat < 1000);
        boolean dusukOran = (girilenFiyat > 1000);
        double kdvDegeri =(yuksekOran)? 18.0:8.0;   // bu kısımda kdvdegerlerini 0,18 -0,08 şeklinde yazıp aşağdaki formullerde /100 dememize gerek yoktu.

        double sonuc = (girilenFiyat);
        System.out.println("KDV'siz Fiyat :" +sonuc +" TL");

        double sonuc1 = ((girilenFiyat * kdvDegeri/100) + girilenFiyat);
        System.out.println("KDV'li Fiyat :" +sonuc1 +" TL");

        double sonuc2 = (girilenFiyat*kdvDegeri/100);
        System.out.println("KDV Tutarı :" +sonuc2 +" TL");

        double sonuc3 =(kdvDegeri);
        System.out.println("KDV Değeri :% " +sonuc3);
    }
}
