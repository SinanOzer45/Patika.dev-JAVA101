import java.util.Scanner;

public class Main {

                            ////// RECURSİVE İLE ÜSLÜ SAYI İŞLEMİ ////// RECURSİVE EXPONENTİAL CALCULATİON ////////
    static int rec(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base =scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent =scan.nextInt();
        int result =1;

        for (int i=1; i<=exponent;i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sonuç : " + rec());

    }
}
