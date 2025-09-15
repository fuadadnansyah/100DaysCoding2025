public class Day8String {
    public static void main(String[] args) {
        String nama = "Fuad";
        String salam = "Assalamu'alaikum";
        String pesan = salam + ", " + nama + "!";
        
        System.out.println(pesan);                      // gabungan string
        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Nama huruf besar: " + nama.toUpperCase());
    }
}
