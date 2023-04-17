import java.util.Scanner;

public class Main {                    //////// Recursive method ile asal sayı hesaplama ////////

    static int primeNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = scan.nextInt();
        int result =0;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                result++;
            }
        }
        if(result == 0) {
            System.out.println(num + " sayısı Asal Sayıdır!");
        }
        else {
            System.out.println(num + " sayısı Asal Sayı değildir!");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber());
    }
}
