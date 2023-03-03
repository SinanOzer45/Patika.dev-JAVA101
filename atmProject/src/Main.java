import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                                        ///////////--Basic ATM Project--//////////    ///---do-while---///
	    String userName, password;
	    int right = 3;
	    int balance = 1500;
	    int select;
        Scanner input = new Scanner(System.in);
       /*
        while (right>0){
            System.out.print("Kullanıcı adınızı girin : ");
            userName =input.nextLine();
            System.out.print("Şifrenizi girin : ");
            password = input.nextLine();

            if (userName.equals("patika")&& password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n"+
                            "2-Para Çekme\n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Sistemden Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    select =input.nextInt();
                    if (select==1){
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance+=price;
                    }else if (select==2){
                        System.out.print("Çekmek istediğiniz tutar : ");
                        int price = input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiyeniz yetersiz.");
                            System.out.println();
                        }else {
                            balance -= price;
                            System.out.println("Kalan bakiye : " + balance);
                        }
                    }else if (select==3){
                        System.out.println("Bakiyeniz : "+balance);
                    }
                }while (select!=4);
                    System.out.println("Sistemden çıkış yapılıyor ...\n" +"Tekrar görüşmek üzere." );

                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Yeniden deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız : "+ right);
                }
            }

        }     */
                           ///////////--Basic ATM Project--//////////    ///--- Switch-Case ---///

		while (right>0){
			System.out.print("Kullanıcı adınızı girin : ");
			userName =input.nextLine();
			System.out.print("Şifrenizi girin : ");
			password = input.nextLine();

			if (userName.equals("patika")&& password.equals("dev123")){
				System.out.println("Merhaba, Kodluyoruz Bankasına hoşgeldiniz.");
				do {
					System.out.println("1-Para Yatırma\n" +
							"2-Para Çekme\n" +
							"3-Bakiye Sorgulama\n" +
							"4-Sistemden Çıkış");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

					select = input.nextInt();
					switch (select) {

						case 1:
							System.out.print("Para miktarı : ");
							int price = input.nextInt();
							balance += price;
							break;

						case 2:
							System.out.print("Çekmek istediğiniz tutar : ");
							price = input.nextInt();
							if (price > balance) {
								System.out.println("Bakiyeniz yetersiz.");
								System.out.println();
							} else {
								balance -= price;
								System.out.println("Kalan bakiye : " + balance);
							}
							break;

						case 3:
							System.out.println("Bakiyeniz : " + balance);
							break;

						case 4:
							System.out.println("Sistemden çıkış yapılıyor ...\n" + "Tekrar görüşmek üzere.");
							break;

							default:
								System.out.println("Hatalı tuşlama yaptınız. Tekrar deneyin!");
					}
				}while (select != 4);
					break;

			}else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre. Yeniden deneyiniz.");
				if (right==0){
					System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
				}else{
					System.out.println("Kalan hakkınız : "+ right);
				}
			}
		}
	}
}
