import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int age, tripType;
        double totalTekYön, totalÇiftYön, distance, cocukÇiftYönİnd, cocukİnd,
                yasliÇiftYönİnd, yasliİnd, gencİnd, gencÇiftYönİnd, ortaYas, ortaYasİnd ;
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi girin :");
        distance = input.nextInt();

        System.out.print("Yaşınızı Girin :");
        age = input.nextInt();

        System.out.println("Yolculuk Tipi Seçiniz : 1)Tek Yön, 2)Gidiş-Dönüş");
        tripType = input.nextInt();

        if (tripType == 1) {
            System.out.println("Tek Yön");

            if (tripType == 1) {
                totalTekYön = (distance * 0.10);
                System.out.println("Toplam İndirimsiz Tek Yön Tutarı :" + totalTekYön + " TL");

                if (age <= 12) {
                    System.out.println("Çocuk Yaş İndirimli Toplam Tutar :" + (totalTekYön - (totalTekYön * 0.50 )+ " TL"));
                } else if (age >= 12 && age <= 24) {
                    System.out.println("Genç Yaş İndirimli Toplam Tutar :" + (totalTekYön - (totalTekYön * 0.10)+ " TL"));
                } else if (age >= 25 && age <= 64) {
                    System.out.println("Orta Yaş İndirimli Toplam Tutar :" + (totalTekYön - (totalTekYön * 0.20)+ " TL"));
                } else if (age >= 65) {
                    System.out.println("Yaşlılık İndirimli Toplam Tutar :" + (totalTekYön - (totalTekYön * 0.30)+ " TL"));
                }
            }
        }
        if (tripType == 2) {
            System.out.println("Gidiş-Dönüş");

            if (tripType == 2) {
                totalÇiftYön = (distance * 0.10 * 2);
                System.out.println("Toplam İndirimsiz Gidiş-Dönüş Tutarı :" + totalÇiftYön + " TL");

                if (age <= 12) {
                    cocukİnd = (totalÇiftYön - (totalÇiftYön*0.50));
                    cocukÇiftYönİnd = (cocukİnd - (cocukİnd*0.20));
                    System.out.println("Çocuk İndirimli Gidiş-Dönüş Toplam Tutar :" + cocukÇiftYönİnd + " TL");
                } else if (age >= 12 && age <= 24) {
                    gencİnd = (totalÇiftYön - (totalÇiftYön*0.20));
                    gencÇiftYönİnd = (gencİnd - (gencİnd*0.20));
                    System.out.println("Genç Yaş İndirimli Gidiş-Dönüş Toplam Tutar :" + gencÇiftYönİnd + " TL");
                } else if (age >= 25 && age <= 64) {
                    ortaYas = (totalÇiftYön - (totalÇiftYön*0.10));
                    ortaYasİnd = (ortaYas - (ortaYas*0.20));
                    System.out.println("Orta Yaş İndirimli Gidiş-Dönüş Toplam Tutar :" + ortaYasİnd+ " TL");
                } else if (age >= 65) {
                    yasliİnd = (totalÇiftYön - (totalÇiftYön*0.30));
                    yasliÇiftYönİnd = (yasliİnd - (yasliİnd*0.20));
                    System.out.println("Yaşlılık İndirimli Gidiş-Dönüş Toplam Tutar :" + yasliÇiftYönİnd + " TL");
                }
            }
        } else if (tripType != 1 && tripType != 2) {
            System.out.println("Hatalı bir değer girdiniz!");
        }
    }
}
