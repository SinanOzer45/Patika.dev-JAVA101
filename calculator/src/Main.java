import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class Main {

    static int plus(){                            ////// TOPLAMA İŞLEMİ //////
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result =0;

        for (int i=1; i<=counter;i++){
            System.out.print(i + ". sayı : ");
            number = scan.nextInt();
            if (i == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }

    static int minus(){                          ////// ÇIKARMA İŞLEMİ //////
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result =0;

        for (int i=1; i<=counter; i++){
            System.out.print(i + ". sayı : ");
            number = scan.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
                                                  ////// ÇARPMA İŞLEMİ //////
    static int times(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result =1;

        for (int i=1;i<= counter;i++){
            System.out.print(i + ". sayı : ");
            number = scan.nextInt();
            if (number==1)
                break;
            if (number == 0){
                result = 0;
                break;
            }
            result*=number;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
                                                 ////// BÖLME İŞLEMİ //////
    static int divided(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scan.nextInt();
        int number, result =1;

        for (int i=1;i<=counter;i++){
            System.out.print(i + ". sayı : ");
            number =scan.nextInt();
            if (i != 1 && number == 0){
                System.out.println("Böleni 0 giremesiniz!");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            } result /= number;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
                                                  ////// ÜSLÜ SAYI İŞLEMLERİ //////
    static int power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base =scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent =scan.nextInt();
        int result =1;

        for (int i=1; i<=exponent;i++){
            result *= base;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
                                                   ////// FAKTÖRİYEL HESAPLAMA //////
    static int factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n = scan.nextInt();
        int result =1;

        for (int i=1; i<=n;i++){
            result *= i;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }
                                                   ////// MOD ALMA İŞLEMLERİ //////
    static int mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = scan.nextInt();
        System.out.print("Mod Giriniz : ");
        int m = scan.nextInt();
        int result=1;
        while (num>=m){
            num -= m;
        }
        System.out.println("Sonuç : " + num);
        return result;
    }
                                                   ////// DİKDÖRTGEN ALAN VE ÇEVRE HESAPLAMA //////
    static int calc(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun Kenarın Değerini giriniz : ");
        int num1 = scan.nextInt();
        System.out.print(" Kısa Kenarın Değerini giriniz : ");
        int num2 = scan.nextInt();

        System.out.println("Dikdörtgenin Alanı : " + (num1*num2));
        System.out.println("Dikdörtgenin Çevresi : " + (2*(num1+num2)));

        int result =1;
        return result;
    }

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int select;
	    String menu = "1- Toplama İşlemi \n"
                + "2- Çıkarma İşlemi \n"
                + "3- Çarpma İşlemi \n"
                + "4- Bölme İşlemi \n"
                + "5- Üslü Sayı Hesaplama \n"
                + "6- Faktöriyel Hesaplama \n"
                + "7- Mod Alma \n"
                + "8- Dikdörtgen Alan ve Çevre Hesaplama \n"
                + "0- Çıkış Yap! \n";

            System.out.print(menu);
	    do {
            System.out.print("Lütfen bir işlem seçiniz : ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }

        }while (select !=0);
        System.out.println("Güle Güle, HOŞÇAKALIN!");
    }
}
