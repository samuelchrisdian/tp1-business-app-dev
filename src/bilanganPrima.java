import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input angka dari pengguna
        System.out.print("Input sebuah angka bulat: ");
        int angka = scanner.nextInt();

        // Cek apakah angka tersebut adalah bilangan prima
        boolean isPrima = cekBilanganPrima(angka);

        // Tampilkan hasil
        if (isPrima) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan angka prima karena bisa dibagi oleh " + faktorPembagi(angka));
        }
    }

    // Fungsi untuk mengecek apakah suatu angka adalah bilangan prima
    private static boolean cekBilanganPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Fungsi untuk mendapatkan faktor pembagi dari suatu angka
    private static int faktorPembagi(int angka) {
        for (int i = 2; i <= angka / 2; i++) {
            if (angka % i == 0) {
                return i;
            }
        }
        return -1; // Jika tidak ada faktor pembagi selain 1 dan angka itu sendiri
    }
}
