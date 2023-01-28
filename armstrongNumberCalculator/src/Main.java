import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                 /*  /////--Bir sayının basamak sayılarının toplamını hesaplayan program--/////

        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;                      // sayının kaç basmaklı olduğunu söyler// ( Ststem.out.prinln(basNumber); yazarsak.) //
            basNumber++;
        }
             tempNumber = number;
            while (tempNumber != 0 ){
                basValue = tempNumber % 10;       // buraya -->> Ststem.out.prinln(basValue); yazarsak her bir basamak değerini görürüz. //
                int basTop = 0;
                basTop += basValue;
                result += basTop;
                tempNumber /= 10;
            }   System.out.println(number + " sayısının basamak değeri toplamı : " + result);      */

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	                 /* //////-- Armstrong sayı olup olmadığını bulan program--//////

        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int basNumber = 0; ///basamak numarası
        int tempNumber = number;    /// kullanıcıdan alınan  geçici değer
        int basValue; /// basamak değeri
        int result = 0; /// sonuc
        int basPow;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        while (tempNumber!=0){
            basValue = tempNumber % 10;
            basPow = 1;

            for (int i =1; i <= basNumber; i++){
                 basPow *= basValue;
            }
                 result += basPow;
                 tempNumber /= 10;
        }
            if (result == number){
                System.out.println(number+ " sayısı armstrong sayısıdır.");
            }else {
                System.out.println(number+ " sayısı armstrong sayı değildir.");
            }  */
    }
}
