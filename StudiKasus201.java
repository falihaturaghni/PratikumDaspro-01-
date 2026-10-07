import java.util.Scanner;

public class StudiKasus201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data Umum
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Jenis Kegiatan (BELMAWA / BAKORMA / Mandiri / PKM / Lainnya): ");
        String jenisKegiatan = sc.nextLine();

        // Pengecekan Jenis Kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            
            //Lomba
            System.out.print("Masukkan Peringkat Juara (1, 2, 3; isi 0 jika bukan juara): ");
            int juara = sc.nextInt();

            if (juara == 1 || juara == 2 || juara == 3) {
                System.out.print("Masukkan Jumlah Dokumen yang Diupload (0-4): ");
                int jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
                    System.out.println("Mahasiswa  : " + nama);
                    System.out.println("Status     : DIBERIKAN");
                    System.out.println("Alasan     : Meraih Juara " + juara + " dan dokumen persyaratan lengkap (4 dokumen).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
                    System.out.println("Mahasiswa  : " + nama);
                    System.out.println("Status     : TIDAK DIBERIKAN");
                    System.out.println("Alasan     : Dokumen tidak lengkap. Dokumen yang masih kurang: " + kurang + " dokumen.");
                }
            } else {
                System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
                System.out.println("Mahasiswa  : " + nama);
                System.out.println("Status     : TIDAK DIBERIKAN");
                System.out.println("Alasan     : Tidak meraih Juara 1, 2, atau 3.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
        // PKM
            System.out.print("Masukkan Status Pendanaan PKM (1 = Lolos, 0 = Tidak Lolos): ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                System.out.print("Masukkan Jumlah Dokumen yang Diupload (0-4): ");
                int jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
                    System.out.println("Mahasiswa  : " + nama);
                    System.out.println("Status     : DIBERIKAN");
                    System.out.println("Alasan     : Tim lolos pendanaan PKM dan dokumen persyaratan lengkap (4 dokumen).");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
                    System.out.println("Mahasiswa  : " + nama);
                    System.out.println("Status     : TIDAK DIBERIKAN");
                    System.out.println("Alasan     : Dokumen tidak lengkap. Dokumen yang masih kurang: " + kurang + " dokumen.");
                }
            } else {
                System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
                System.out.println("Mahasiswa  : " + nama);
                System.out.println("Status     : TIDAK DIBERIKAN");
                System.out.println("Alasan     : Tim tidak lolos pendanaan PKM.");
            }

        } else {
            
            //Lainnya
            System.out.println("\n--- STATUS DANA PENGHARGAAN ---");
            System.out.println("Mahasiswa  : " + nama);
            System.out.println("Status     : TIDAK DIBERIKAN");
            System.out.println("Alasan     : Jenis kegiatan selain BELMAWA, BAKORMA, Mandiri, dan PKM tidak memperoleh dana penghargaan.");
        }
        sc.close();
    }
}
