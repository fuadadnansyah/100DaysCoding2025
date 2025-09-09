public class Biodata {
    public static void main(String[] args) {
        // Menggunakan println() -> otomatis ganti baris
        System.out.println("=== BIODATA SEDERHANA ===");
        System.out.println("Nama  : Fuad Adnansyab");
        System.out.println("Umur  : 18 Tahun");
        
        // Menggunakan print() -> tidak ganti baris
        System.out.print("Hobi  : ");
        System.out.print("Badminton\n");  // pakai \n agar ganti baris manual

        // Menggunakan printf() -> cetak dengan format
        double tinggi = 167.5;
        double berat = 67.0;
        System.out.printf("Tinggi: %.1f cm, Berat: %.1f kg\n", tinggi, berat);
    }
}
