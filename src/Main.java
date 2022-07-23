import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int mod, yil;

        //Kullanicidan veri alindi ve hesaplanarak geri bildirim verildi.
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.print("Dogum Yilinizi Giriniz : ");
        yil = scan.nextInt();

        mod = yil % 12;

        switch (mod)
        {
            case 0:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Maymun");
                break;

            case 1:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Horoz");
                break;

            case 2:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Kopek");
                break;

            case 3:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Domuz");
                break;

            case 4:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Fare");
                break;

            case 5:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Okuz");
                break;

            case 6:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Kaplan");
                break;

            case 7:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Tavsan");
                break;

            case 8:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Ejderha");
                break;

            case 9:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Yilan");
                break;

            case 10:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : At");
                break;

            case 11:
                System.out.println("--------------------------------");
                System.out.println("Cin Zodyagi Burcunuz : Koyun");
                break;

            default:
                System.out.println("--------------------------------\nBir Hata Olustu.\nSonra Tekrar Deneyiniz!");
        }
    }
}
