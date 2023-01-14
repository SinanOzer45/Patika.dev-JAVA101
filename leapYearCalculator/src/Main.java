import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // değişkenler yazılır
        int leapYear;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        leapYear = input.nextInt();

        if (leapYear % 4 == 0 && (leapYear % 400 == 0 || leapYear % 100 !=0)) {
            System.out.println(leapYear + " bir artık yıldır!");
        }else {
            System.out.println(leapYear + " bir artık yıl değildir!");
        }
    }
}
