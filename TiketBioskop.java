import java.util.Scanner;
public class TiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        double totalHarga, totalPendapatan = 0, diskon = 1, hargaTiket = 50000;;
        String loop = "";
        do {
           System.out.print("Masukkan jumlah tiket yang dibeli: "); 
           jumlahTiket = sc.nextInt();
           sc.nextLine();
            if (jumlahTiket <= 0){
            System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
            loop = "ya";
            continue;
            } else if (jumlahTiket > 4){
            diskon = 0.1;
           } else if (jumlahTiket > 10){
            diskon = 0.15;
           }
           totalHarga = jumlahTiket* hargaTiket - (jumlahTiket * hargaTiket * diskon);
           totalPendapatan += totalHarga;
           System.out.print("ada lagi? 'ya/tidak':  ");
           loop = sc.nextLine();
        } while (loop.equalsIgnoreCase("ya"));
        System.out.println("Total pendapatan hari ini: Rp. " +totalPendapatan);
        sc.close();
    }
}
