import java.util.Scanner;

public class Biodata{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("Umur: ");
        int umur = sc.nextInt();

        System.out.print("Alamat: ");
        String alamat = sc.nextLine();

        System.out.println("\n=== Biodata ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);

        
    }
}
