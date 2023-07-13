import java.util.Scanner;

public class UcgenCevreAlan {
    public static void main(String[] args) {
        int dik1,dik2;
        int kenar1, kenar2, kenar3;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Hipotenüs Hesaplamak İçin İlk Dik Kenar Ölçüsünü Giriniz: ");
        dik1 = input.nextInt();

        System.out.print("Lütfen Hipotenüs Hesaplamak İçin İkinci Dik Kenar Ölçüsünü Giriniz: ");
        dik2 = input.nextInt();

        double hipotenus = (dik1 * dik1) + (dik2 * dik2);

        System.out.println("Dik Üçgenin Hipotenüsü: " + Math.sqrt(hipotenus));

        System.out.print("Lütfen Alanını Hesaplamak İstediğiniz Üçgenin İlk Kenarını Giriniz: ");
        kenar1 = input.nextInt();

        System.out.print("Lütfen Alanını Hesaplamak İstediğiniz Üçgenin İkinci Kenarını Giriniz: ");
        kenar2 = input.nextInt();

        System.out.print("Lütfen Alanını Hesaplamak İstediğiniz Üçgenin İkinci Kenarını Giriniz: ");
        kenar3 = input.nextInt();

        int yariCevre = (kenar1 + kenar2 + kenar3) / 2;

        double alanKare = yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3);

        System.out.print("Üçgenin Alanı: " + Math.sqrt(alanKare));
    }
}
