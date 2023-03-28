import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" N sayısını giriniz : ");
        int n = input.nextInt();
        System.out.println(); // boşluk için
        for (int i =(n-1);i >= 1; i--){               // kaç satır gezeceğimizi belirler. //

            for (int j = 1;j <= (n-i); j++){          // satır başından ne kadar boşluk bırakılması gerektiğini belirler. //
                System.out.print(" ");
            }
            for (int k = 1;k <= (2 * i) - 1; k++){    // her satırda kaç adet yıldız olması gerektiğini belirler. //
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

