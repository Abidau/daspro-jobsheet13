import java.util.Scanner;
public class className {
    static String [] nama = new String[100];
    static String [] nim = new String[100];
    static String [] jenis = new String[100];
    static String [] tingkat = new String[100];
    static int [] tahun = new int[100];
    static int i = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            
            System.out.print("Pilih menu : ");
            int menu = sc.nextInt();
    
            if (menu == 1) {
                tambahDataPrestasi();
            } else if (menu == 2) {
                tampilkanSemuaPrestasi();
            } else if (menu == 3) {
                analisisPrestasi();
            } else if (menu == 4) {
                break;
            } 
        }
    }
}