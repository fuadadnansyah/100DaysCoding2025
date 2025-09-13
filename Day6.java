public class TipeDataPecahan {
    public static void main(String[] args) {
        // Contoh tipe data pecahan
        float nilaiFloat = 3.14f; // tambahkan 'f' di akhir untuk float
        double nilaiDouble = 3.141592653589793;

        // Output nilai float dan double
        System.out.println("Nilai float  : " + nilaiFloat);
        System.out.println("Nilai double : " + nilaiDouble);

        // Perbedaan presisi
        float angkaFloat = 1.0f / 3.0f;
        double angkaDouble = 1.0 / 3.0;

        System.out.println("\nPresisi float  (1/3) : " + angkaFloat);
        System.out.println("Presisi double (1/3) : " + angkaDouble);
    }
}
