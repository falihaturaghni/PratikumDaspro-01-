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

    }
}

