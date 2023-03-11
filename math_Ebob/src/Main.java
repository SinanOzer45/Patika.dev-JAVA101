import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n1, n2 ;

        System.out.print("N1 sayısını giriniz : ");
        n1 = scan.nextInt();

        System.out.print("N2 sayısını giriniz : ");
        n2 = scan.nextInt();
        int ebob =1;
                                               /* EBOB hesabı(account) */
     /* for (int k =n1;k>=1;k--){
            if (n1%k == 0 && n2%k ==0){
                System.out.println(k);
                ebob =k;
                break;
            }
        } */
        System.out.println("---------");
                                               /*EKOK hesabı(account)*/

        for (int i = 1 ; i <= (n1*n2); i++){
            if (i%n1 == 0 && i%n2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
