import java.util.Scanner;
public class FiturTambahDataPrestasi {
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
                System.out.println("FITUR TAMPIL PRESTASI");;
            } else if (menu == 3) {
                System.out.println("FITUR ANALISIS PRESTASI");;
            } else if (menu == 4) {
                break;
            } 
        }
    }
    
    static void tambahDataPrestasi() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        nama[i] = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        nim[i] = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        jenis[i] = sc.nextLine();
        System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasioal/Internasional): ");
        tingkat[i] = sc.nextLine();
        
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            int thn = sc.nextInt();
            if (thn >= 2010 && thn <= 2024) {
                tahun[i] = thn;
                System.out.println("Data prestasi berhasil ditambahkan.");
                System.out.println();
                i++;  
                break;
            } else {
                System.out.println("Tahun tidak valid. Coba lagi.");
                continue;
            }
        }     
    }
}