import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int adet = klavye.nextInt();
        int number,i =1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
                                            //////// for döngüsüyle /////////
/*
        for (int i =1; i<=adet; i++){
            System.out.print(i + ". sayıyı giriniz : ");
            number = klavye.nextInt();

            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);

        */
                                            ///// While döngüsüyle //////
        while (i <= adet){
            System.out.print(i + ". sayıyı giriniz : ");
            number = klavye.nextInt();

            if (number < min){
                min = number;
            }else{
                max = number;
            }
            i++;
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
