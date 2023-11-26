import java.util.Scanner;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jenis buku
        System.out.print("Jenis buku (pelajaran/novel/skripsi): ");
        String jenisBuku = scanner.nextLine().toLowerCase();

        // Input jumlah hari keterlambatan
        System.out.print("Jumlah hari keterlambatan: ");
        int hariKeterlambatan = scanner.nextInt();

        // Hitung denda
        int denda = hitungDenda(jenisBuku, hariKeterlambatan);

        // Tampilkan hasil
        if (denda > 0) {
            System.out.println("Denda yang harus dibayar: Rp" + denda);
        } else {
            System.out.println("Tidak ada denda, buku dapat dipinjam gratis.");
        }
    }

    // Fungsi untuk menghitung denda berdasarkan jenis buku dan jumlah hari keterlambatan
    private static int hitungDenda(String jenisBuku, int hariKeterlambatan) {
        int dendaPerHari = 0;

        switch (jenisBuku) {
            case "pelajaran":
                dendaPerHari = 2000;
                break;
            case "novel":
                dendaPerHari = 5000;
                break;
            case "skripsi":
                dendaPerHari = 10000;
                break;
            default:
                System.out.println("Jenis buku tidak valid.");
                System.exit(1);
        }

        if (hariKeterlambatan <= 0) {
            return 0; // Tidak ada denda jika tidak melewati batas waktu
        }

        return dendaPerHari * hariKeterlambatan;
    }
}
