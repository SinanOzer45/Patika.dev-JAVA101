
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword, cevap ;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz :");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        password = input.nextLine();

        if (userName.equals(("patika"))&& password.equals("java123")) {  //equals string sınıfı için bu şekilde yazımı sağlar.
            System.out.println("Şifreniz Doğru." + " Giriş Yaptınız!");
        }else if (password.equals("java123")) {
            System.out.println("Kullanıcı adınız yanlış :");
        }else if (userName.equals("patika")) {
            System.out.println("Şifreniz Yanlış!" + "" + "\nŞifrenizi sıfırlamak ister misiniz?" + "\nEVET\nHAYIR");
        }else {
            System.out.println("Bilgileriniz Yanlış!"); // hem kullanıcı adı hem de şifre yanlış ise bu bilgi kullanıcıya verilir.
        }
                cevap =input.nextLine(); // kullanıcıdan cevap istenir
            if (cevap.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz! :");
                newPassword = input.nextLine();
                System.out.print("Yeni şifrenizi tekrar giriniz :");
            }else if(cevap.equals("hayır")){
                System.out.println("Şifre Değiştirilmedi. Tekrar Deneyin!");
            }
                newPassword = input.nextLine();
            if (newPassword.equals("java123")) {
                System.out.print("Şifre önceki şifreyle aynı olamaz! " + " Lütfen tekrar deneyin!");
            }else {
                System.out.println("Yeni şifre başarı ile oluşturuldu.");
            }
        }
    }
