import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // değişkenler yazılır
        int dogumTarihi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Doğum Tarihinizi Giriniz : ");
        dogumTarihi = scan.nextInt();

        //// Koşullarımızı yazıyoruz

        if (dogumTarihi % 12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
            } else if (dogumTarihi % 12 == 1) {
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
            } else if (dogumTarihi % 12 == 2) {
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
            } else if (dogumTarihi % 12 == 3) {
                System.out.println("Çin Zodyağı Burcunuz : Domuz");
            } else if (dogumTarihi % 12 == 4) {
                System.out.println("Çin Zodyağı Burcunuz : Fare");
            } else if (dogumTarihi % 12 == 5) {
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
            } else if (dogumTarihi % 12 == 6) {
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
            } else if (dogumTarihi % 12 == 7) {
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
            } else if (dogumTarihi % 12 == 8) {
                System.out.println("Çin Zodyağı Burcunuz : Ejderha");
            } else if (dogumTarihi % 12 == 9) {
                System.out.println("Zodiac Burcunuz : Yılan");
            } else if (dogumTarihi % 12 == 10) {
                System.out.println("Çin Zodyağı Burcunuz : At");
            } else if (dogumTarihi % 12 == 11) {
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
            }
        }
    }

