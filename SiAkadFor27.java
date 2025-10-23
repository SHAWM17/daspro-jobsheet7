import java.util.Scanner;
public class SiAkadFor27 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            } else if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus += 1;
            } else {
                tidakLulus += 1;
            }
        }
        System.out.println("Nilai tertinggi saat ini: " + tertinggi);
        System.out.println("Nilai terendah saat ini: " + terendah);
        System.out.println("Jumlah siswa yang lulus: " + lulus);
        System.out.println("Jumlah siswa yang tidak lulus: " + tidakLulus);
        sc.close();
        }
}
