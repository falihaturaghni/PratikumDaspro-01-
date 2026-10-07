import java.util.Scanner;

public class StudiKasus101 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    //Deklarasi
    int hargaPerCup = 18000;
    int jumlahCup, uangBayar;
    int totalHarga, diskon, totalBayar;
    int kembalian, kurang;  

     //Input
    System.out.print("Masukkan jumlah cup: " );
    jumlahCup = sc.nextInt();

    System.out.print("Masukkan uang bayar: Rp ");
    uangBayar = sc.nextInt();

    //Hitung total harga dan diskon
    totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;

    if (totalHarga >= 1000000) {
        diskon = totalHarga * 10 / 100;
    }

    //Hitung total yg harus dibayar
    totalBayar = totalHarga - diskon;

   // Output total harga, diskon, dan total bayar
        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);

        // Logika pembayaran dan kembalian
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian   : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        sc.close();

    }
}

