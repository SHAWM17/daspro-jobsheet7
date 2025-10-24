import java.util.Scanner;
public class TempatParkir {
    public static void main(String[] args) {
        int jenis, durasi, total=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan jenis kendaraan (1.Mobil / 2.Motor / 0.Keluar): ");
            jenis = sc.nextInt();
            sc.nextLine();
            if (jenis ==1 || jenis ==2){
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                sc.nextLine();
                 if (durasi > 5){
                total +=12500;
                continue;
                 }
                 if (jenis == 1) {
                total += durasi * 3000;
                } else if (jenis == 2) {
                total += durasi * 2000;
                } else {
                    jenis = 0;
                }
            } else {
                jenis = 0;
            }
            
            
        } while (jenis != 0);
        System.out.println("Total pendapatan hari ini: Rp. " + total);
        sc.close();
    }
}