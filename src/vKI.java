import java.util.Scanner;

public class vKI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) girin:");
        double boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu girin:");
        double agirlik = scanner.nextDouble();

        // VKI Hesaplama
        double vki = vki (agirlik, boy);

        // Sonucu Göster
        System.out.println("Vücut Kitle İndeksi (VKI): " + vki);

        scanner.close();
    }

    private static double vki(double boy, double agirlik) {
        // VKI Formülü: ağırlık / (boy * boy)
        return agirlik / (boy * boy);
    }
}