import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// Değişkenler belirlenir
        int km;
        double perKm=2.20, hesap=10;      //perKm ing. km basına anlamına gelir. // startPrice=10 girip

        Scanner inp =new Scanner(System.in);

        System.out.print("Gidilen KM yi Giriniz :");
        km =inp.nextInt(); // Atama Operatörü
        hesap +=(km*perKm);     // hesap = (km*perKm);  yazılıp altına hesap +=startPrice; diyede yazılabilir. aynı sonuc alınır.
        hesap = (hesap<20) ? 20 : hesap;
        System.out.print("Toplam Tutar :" +hesap +" TL");
    }
}
