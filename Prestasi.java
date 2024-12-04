import java.util.Scanner;
public class Prestasi {
    static String [][] data = new String[100][5];
    static int i = 0;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
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

        System.out.print("Masukkan Nama Mahasiswa: ");
        data[i][0] = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        data[i][1] = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        data[i][2] = sc.nextLine();
        System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasioal/Internasional): ");
        data[i][3] = sc.nextLine();

        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            int thn = sc.nextInt();
            if (thn >= 2010 && thn <= 2024) {
                data[i][4] = String.valueOf(thn);
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
            System.out.println("Nama: " + data[j][0] + " | NIM: " + data[j][1] + " | Jenis: " + data[j][2] + " | Tingkat: " + data[j][3] + " | Tahun: " + data[j][4]);
        }
    }

    static void analisisPrestasi() {
        
        System.out.print("Masukkan Jenis Prestasi yang Ingin Dianalisis: ");
        String jenisPrestasi = sc.nextLine();

        for (int j = 0; j < i; j++) {
            if (jenisPrestasi.equalsIgnoreCase(data[j][2])) {
                System.out.println();
                System.out.println("=== ANALISIS PRESTASI ===");
                System.out.println("Nama: " + data[j][0] + " | NIM: " + data[j][1] + " | Jenis: " + data[j][2] + " | Tingkat: " + data[j][3] + " | Tahun: " + data[j][4]);
                System.out.println();
            }
        }
    }
}

