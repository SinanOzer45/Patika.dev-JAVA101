import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //NESNEMİZİ YAZIYORUZ
        Scanner input = new Scanner(System.in);
        //DEĞİŞKENLER BELİRLERNİR
        int n1, n2, select;
        //KULLANICIDAN BİLGİ İSTEMEK İÇİN KODLARIMIZ
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 =input.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print(" İşlem için seçim yapınız :");
        select = input.nextInt();

                // IF-ELSE KULLANARAK İŞLEM BASAMAKLARI

        if (select==1){
            System.out.println("Toplama :" + (n1 + n2));
        }else if (select==2){
            System.out.println("Çıkarma :" + (n1 - n2));
        }else if (select==3){
            System.out.println("Çarpma :" + (n1 * n2));
        }else if (select==4){
            if (n2!=0){
                System.out.println("Bölme :" + (n1 / n2));
            }else
                System.out.println("Herhangi bir sayı sıfıra bölünemez!");
        }else
            System.out.println("Yanlış bir seçenek seçtiniz. Lütfen tekrar deneyin!");


                       // AYNI YAPIYI SWİTCH-CASE İle YAPALIM.

        switch (select){
            case 1:
                System.out.println("Toplama :" + (n1 + n2));
                 break;
            case 2:
                System.out.println("Çıkarma :" +(n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma :" +(n1 * n2));
                break;
            case 4:
                if (n2!=0) {
                    System.out.println("Bölme :" + (n1 / n2));
                }else {
                    System.out.println("Herhangi bir sayı sıfıra bölünemez!");
                }break;
            default:
                System.out.println("Yanlış bir seçenek seçtiniz. Lütfen tekrar deneyin!"); 
            return;
        }
    }
}
