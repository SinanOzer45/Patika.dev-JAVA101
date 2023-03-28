import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num, total = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        num = inp.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.println(num + " sayısı mükemmel sayıdır.");
        } else {
            System.out.println(num + " sayısı mükemmel sayı değildir.");
        }
    }
}







