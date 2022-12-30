import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Değişkenlerimizi tanımlıyoruz (ders isimleri)
        int matematik, fizik, kimya, biyoloji, tarih, cografya, muzik;

          //Scanner sınıfını tanımlıyoruz // buradaki input nesne
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Biyoloji Notunuzu Giriniz: ");
        biyoloji = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.print("Coğrafya Notunuzu Giriniz: ");
        cografya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        //ortalamayı hesaplayan kodumuzu yazıyoruz

        int toplam = (matematik +fizik +kimya +biyoloji +tarih +cografya +muzik);
        double ortalama = (toplam/7.0);
        System.out.println("Not Ortalamanız: " + ortalama);

        // Not Ortalaması 60 dan Küçük ise Kaldı, eğer 60 dan büyükse Geçti şeklinde koşulu yazdığımız kod

        String kosul = ortalama<60 ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(kosul);
    }
}
