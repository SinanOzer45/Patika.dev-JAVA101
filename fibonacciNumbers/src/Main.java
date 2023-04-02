import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        int n1=0,n2=1;
        System.out.print("Sayı giriniz: ");
        int num =input.nextInt();
        System.out.print(num+" sayısının fibonacci değerleri: ");
        for (int i=1;i<=num;i++){
            System.out.print(n1+"  ");
            int total= n1+n2;
                n1=n2;
                n2=total;
        }
    }
}
