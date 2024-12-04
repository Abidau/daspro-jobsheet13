import java.util.Scanner;

public class AnalisisData {
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
                tampilkanSemuaPrestasi();
            } else if (menu == 3) {
                analisisPrestasi();
            } else if (menu == 4) {
                System.out.println("Program Selesai. Terima Kasih!");
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

    static void tampilkanSemuaPrestasi() {
        for (int j = 0; j < i; j++) {
            System.out.println("Nama: " + nama[j] + " | NIM: " + nim[j] + " | Jenis: " + jenis[j] + " | Tingkat: " + tingkat[j] + " | Tahun: " + tahun[j]);
        }
    }

    static void analisisPrestasi() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jenis Prestasi yang Ingin Dianalisis: ");
        String jenisPrestasi = sc.nextLine();

        for (int j = 0; j < i; j++) {
            if (jenisPrestasi.equalsIgnoreCase(jenis[j])) {
                System.out.println();
                System.out.println("=== ANALISIS PRESTASI ===");
                System.out.println("Nama: " + nama[j] + " | NIM: " + nim[j] + " | Jenis: " + jenis[j] + " | Tingkat: " + tingkat[j] + " | Tahun: " + tahun[j]);
                System.out.println();
            }
        }

        // for (int i = 0; i < nama.length; i++) {
        //     if (nama[i] != null) {
        //         if (jenisPrestasi.equalsIgnoreCase(jenis[i])) {
        //             System.out.println();
        //             System.out.println("=== ANALISIS PRESTASI ===");
        //             System.out.println("Nama: " + nama[i] + " | NIM: " + nim[i] + " | Jenis: " + jenis[i] + " | Tingkat: " + tingkat[i] + " | Tahun: " + tahun[i]);
        //             System.out.println();
        //         }
        //     }
        // }
    }
}
}
